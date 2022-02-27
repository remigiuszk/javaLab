package pl.kaminski;

import pl.kaminski.Model.Animal;
import pl.kaminski.Model.Car;
import pl.kaminski.Model.Human;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Human me = new Human();

        me.pet = new Animal("dog");
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.feed();

        me.car =  new Car("golf", "WW", "black");

        me.setSalary(12.0);
        me.getSalary();

        Thread.sleep(2000);

        me.setSalary(17.0);
        me.getSalary();
    }
}
