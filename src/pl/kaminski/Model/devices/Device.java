package pl.kaminski.Model.devices;

public abstract class Device {
    protected final String model;
    protected final String producer;
    protected final Integer yearOfProduction;
    protected boolean isTurnedOn;

    public Device(String model, String producer, Integer yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void TurnOn();
}
