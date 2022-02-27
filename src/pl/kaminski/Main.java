package pl.kaminski;

import pl.kaminski.Model.Human;
import pl.kaminski.Model.devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {
        Phone motorola = new Phone("razor", "motorola", 2011);

        Human me = new Human();

        Human you = new Human();

        me.setDevice(motorola);
        me.setCash(0);
        you.setCash(10);

        motorola.sell(me, you, 10.0);
    }
}
