package pl.kaminski.Model;

public class Animal {
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
        if(!isAlive)
            System.out.println("The animal is dead, you monster...");
        else {
            weight++;
            System.out.println("Animal fed, current weight: " + weight.toString());
        }
    }

    public void takeForAWalk(){
        if(!isAlive)
            System.out.println("The animal is dead, you monster...");
        else{
            weight--;
            System.out.println("Animal taken for a walk, current weight: " + weight.toString());
            if(weight < 0) {
                isAlive = false;
                System.out.println("Your animal died.");
            }
        }
    }

}
