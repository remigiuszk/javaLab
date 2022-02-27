package pl.kaminski.Model.devices;

public class Car extends Device {
    private String color;
    private Double value;

    public Car(String model, String producer,Integer yearOfProduction, String color, Double value) {
        super(model, producer, yearOfProduction);
        this.color = color;
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    @Override
    public void turnOn() {
        isTurnedOn = true;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", value=" + value +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", isTurnedOn=" + isTurnedOn +
                '}';
    }
}
