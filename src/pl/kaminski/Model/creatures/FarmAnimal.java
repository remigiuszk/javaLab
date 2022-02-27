package pl.kaminski.Model.creatures;

public class FarmAnimal extends Animal implements IEdible{
    public FarmAnimal(String spieces) {
        super(spieces);
    }

    @Override
    public void beEaten() {
        setAlive(false);
        setWeight(0.0);
    }
}
