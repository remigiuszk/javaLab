package pl.kaminski.Model.devices;

import pl.kaminski.Model.Human;
import pl.kaminski.Model.ISellable;

public abstract class Device implements ISellable {
    protected final String model;
    protected final String producer;
    protected final Integer yearOfProduction;
    protected boolean isTurnedOn;

    public Device(String model, String producer, Integer yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void turnOn();

    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if(seller.getDevice() != this) throw new Exception("Seller does not have a device that is the subject of the transaction");
        if(buyer.getCash() < price) throw new Exception("Buyer does not have enough cash");
        buyer.setCash(buyer.getCash() - price);
        seller.setCash(seller.getCash() + price);
        seller.setDevice(null);
        buyer.setDevice(this);
        System.out.println(this.toString() + "\nhas been sold to\n " + buyer.toString() + "\nfrom "+seller.toString() + "\nfor " + price.toString());
    }

}
