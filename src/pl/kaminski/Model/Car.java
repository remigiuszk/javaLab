package pl.kaminski.Model;

public class Car {
    private final String model;
    private final String producer;
    private String color;

    public Car(String model, String producer, String color) {
        this.model = model;
        this.producer = producer;
        this.color = color;
    }
}
