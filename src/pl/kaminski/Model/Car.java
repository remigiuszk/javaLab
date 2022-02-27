package pl.kaminski.Model;

public class Car {
    private final String model;
    private final String producer;
    private String color;
    private Double value;

    public Car(String model, String producer, String color, Double value) {
        this.model = model;
        this.producer = producer;
        this.color = color;
        this.value = value;
    }

    public Double getValue() {
        return value;
    }
}
