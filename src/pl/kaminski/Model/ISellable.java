package pl.kaminski.Model;

public interface ISellable {
    public void sell(Human seller, Human buyer, Double price) throws Exception;
}
