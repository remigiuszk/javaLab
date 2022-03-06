package pl.kaminski.Model.devices;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;

public class Phone extends Device {

    static final String DEFAULT_APP_ADRESS = "domain.com/";
    static final String DEFAULT_PROTOCOL = "https://";
    static final String DEFAULT_APP_VERSION = "1.0";
    private List<App> installedApps;

    public Phone(String model, String producer, Integer yearOfProduction) {
        super(model, producer, yearOfProduction);
        installedApps = new ArrayList<>();
    }

    @Override
    public void turnOn() {
        isTurnedOn = true;
    }

    public void installAnApp(String appName){
        installedApps.add(new App(appName, DEFAULT_APP_VERSION, new Url(DEFAULT_PROTOCOL, DEFAULT_APP_ADRESS, appName, DEFAULT_APP_VERSION)));
    }

    public void installAnApp(String appName, String appVersion){
        installedApps.add(new App(appName, appVersion, new Url(DEFAULT_PROTOCOL, DEFAULT_APP_ADRESS, appName, appVersion)));
    }

    public void installAnApp(Url url){
        installedApps.add(new App(url.getAppData().getKey(), url.getAppData().getValue(), url));
    }

    public void installAnApp(List<String> appNamesList){
        for (String name :
                appNamesList) {
            installedApps.add(new App(name, DEFAULT_APP_VERSION, new Url(DEFAULT_PROTOCOL, DEFAULT_APP_ADRESS, name, DEFAULT_APP_VERSION)));

        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "installedApps=" + installedApps +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", isTurnedOn=" + isTurnedOn +
                '}';
    }
}
