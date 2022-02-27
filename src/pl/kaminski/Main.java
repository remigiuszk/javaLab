package pl.kaminski;

import pl.kaminski.Model.Animal;

public class Main {

    public static void main(String[] args) {
        Animal doggo = new Animal("dog");
        doggo.feed();
        doggo.takeForAWalk();
        doggo.takeForAWalk();
        doggo.takeForAWalk();
        doggo.feed();
    }
}
