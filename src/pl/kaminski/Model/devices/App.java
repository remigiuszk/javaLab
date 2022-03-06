package pl.kaminski.Model.devices;

import java.util.AbstractMap;

public class App {
    private AbstractMap.SimpleEntry<String, String> nameAndVersion;
    private Url url;

    @Override
    public String toString() {
        return "App{" +
                "nameAndVersion=" + nameAndVersion +
                ", url=" + url +
                '}';
    }

    public App(String appName, String version, Url url) {
        nameAndVersion = new AbstractMap.SimpleEntry<String, String>(appName, version);
        this.url = url;
    }
}
