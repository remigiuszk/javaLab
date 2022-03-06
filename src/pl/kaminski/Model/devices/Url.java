package pl.kaminski.Model.devices;

import java.util.AbstractMap;

public class Url {
    private String protocol;
    private String adress;
    private AbstractMap.SimpleEntry<String, String> appData;

    public Url(String protocol, String adress, String appName, String version) {
        this.protocol = protocol;
        this.adress = adress;
        this.appData = new AbstractMap.SimpleEntry<>(appName, version);
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public AbstractMap.SimpleEntry<String, String> getAppData() {
        return appData;
    }

    public void setAppData(AbstractMap.SimpleEntry<String, String> appData) {
        this.appData = appData;
    }

    @Override
    public String toString() {
        return "Url{" +
                "protocol='" + protocol + '\'' +
                ", adress='" + adress + '\'' +
                ", appData=" + appData +
                '}';
    }
}
