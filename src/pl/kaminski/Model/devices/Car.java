package pl.kaminski.Model.devices;

public class Car extends Device {
    private String color;
    private Double value;
    private Double fuelLevel;

    public Car(String model, String producer,Integer yearOfProduction, String color, Double value) {
        super(model, producer, yearOfProduction);
        this.color = color;
        this.value = value;
        fuelLevel = 100.0;
    }

    public Double getValue() {
        return value;
    }

    @Override
    public void turnOn() {
        isTurnedOn = true;
    }

    public void refuel() { fuelLevel = 100.0;}

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
