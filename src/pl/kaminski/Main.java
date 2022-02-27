package pl.kaminski;

import pl.kaminski.Model.Animal;
import pl.kaminski.Model.Car;
import pl.kaminski.Model.Human;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Human me = new Human();

        Car golf =  new Car("golf", "WW", "black", 1200.0);

        me.setSalary(12.0);
        me.setCar(golf);

        me.setSalary(200.0);
        me.setCar(golf);

        me.setCar(new Car("126p", "fiat", "green", 120.0));

    }
}
