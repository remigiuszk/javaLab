package pl.kaminski.Model;

public class Animal implements ISellable {
    private final String spieces;
    private Double weight;
    private Boolean isAlive;

    public Animal(String spieces) {
        this.spieces = spieces;
        isAlive = true;
        switch (spieces) {
            case "dog":
                weight = 2.5;
            case "cat":
                weight = 2.0;
            case "hamster":
                weight = 1.0;
        }
    }

    public void feed() {
        if (!isAlive)
            System.out.println("The animal is dead, you monster...");
        else {
            weight++;
            System.out.println("Animal fed, current weight: " + weight.toString());
        }
    }

    public void takeForAWalk() {
        if (!isAlive)
            System.out.println("The animal is dead, you monster...");
        else {
            weight--;
            System.out.println("Animal taken for a walk, current weight: " + weight.toString());
            if (weight < 0) {
                isAlive = false;
                System.out.println("Your animal died.");
            }
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "spieces='" + spieces + '\'' +
                ", weight=" + weight +
                ", isAlive=" + isAlive +
                '}';
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if(seller.pet != this) throw new Exception("Seller does not have a pet that is the subject of the transaction");
        if(buyer.getCash() < price) throw new Exception("Buyer does not have enough cash");
        buyer.setCash(buyer.getCash() - price);
        seller.setCash(seller.getCash() + price);
        seller.pet = null;
        buyer.pet = this;
        System.out.println(this.toString() + "\nhas been sold to\n " + buyer.toString() + "\nfrom "+seller.toString() + "\nfor " + price.toString());
    }
}
