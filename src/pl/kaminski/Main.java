package pl.kaminski;

import pl.kaminski.Model.Animal;
import pl.kaminski.Model.Car;
import pl.kaminski.Model.Human;

public class Main {

    public static void main(String[] args) {
        Human me = new Human();

        me.pet = new Animal("dog");
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.feed();

        me.car =  new Car("golf", "WW", "black");
    }
}
