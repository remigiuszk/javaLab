package pl.kaminski;

import pl.kaminski.Model.creatures.FarmAnimal;
import pl.kaminski.Model.devices.Phone;
import pl.kaminski.Model.devices.Url;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        FarmAnimal cow = new FarmAnimal("cow");

        System.out.println(cow.getWeight().toString());
        cow.feed(12.0);
        System.out.println(cow.getWeight().toString());

        cow.beEaten();
        System.out.println(cow.toString());

        Phone phone = new Phone("nord", "oneplus", 2020);
        phone.installAnApp(new Url("http://", "appstore.com","appFromUrl", "3.0"));
        phone.installAnApp("appFromName", "4.0");
        phone.installAnApp(("appFromOnlyName"));
        List<String> appsToInstall = new ArrayList<String>();
        appsToInstall.add("appFromList1");
        appsToInstall.add("appFromList2");
        phone.installAnApp(appsToInstall);

        System.out.println(phone);
    }
}
