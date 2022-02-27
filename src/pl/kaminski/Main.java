package pl.kaminski;

import pl.kaminski.Model.Animal;
import pl.kaminski.Model.Human;
import pl.kaminski.Model.devices.Car;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Car golf = new Car("golf", "WW", "black", 1200.0);
        Car golf2 = new Car("golf", "WW", "black", 1200.0);

        Human human = new Human();
        Animal dog = new Animal("dog");

        System.out.println(golf == golf2);
        System.out.println(golf.toString());
        System.out.println(golf.toString().equals(golf2.toString()));
        System.out.println(human.toString());
        System.out.println(dog.toString());
    }
}
