package pl.kaminski;

import pl.kaminski.Model.Human;
import pl.kaminski.Model.creatures.FarmAnimal;
import pl.kaminski.Model.devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {
        FarmAnimal cow = new FarmAnimal("cow");

        System.out.println(cow.getWeight().toString());
        cow.feed(12.0);
        System.out.println(cow.getWeight().toString());

        cow.beEaten();
        System.out.println(cow.toString());
    }
}
