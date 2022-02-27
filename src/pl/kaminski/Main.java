package pl.kaminski;

import pl.kaminski.Model.Animal;
import pl.kaminski.Model.Human;
import pl.kaminski.Model.devices.Car;
import pl.kaminski.Model.devices.Phone;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Phone motorola = new Phone("razor", "motorola", 2011);
        System.out.println(motorola.toString());

        Car golf = new Car("golf", "ww", 2012, "red", 3000.0);
        golf.TurnOn();
        System.out.println(golf);
    }
}
