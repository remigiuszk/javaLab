package pl.kaminski.Model.devices;

public class Phone extends Device {

    public Phone(String model, String producer, Integer yearOfProduction) {
        super(model, producer, yearOfProduction);
    }

    @Override
    public void TurnOn() {
        isTurnedOn = true;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", isTurnedOn=" + isTurnedOn +
                '}';
    }
}
