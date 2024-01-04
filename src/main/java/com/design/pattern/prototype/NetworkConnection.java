package com.design.pattern.prototype;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class NetworkConnection implements Cloneable {

    private String ip;

    private String importantData;

    private List<String> domains = new ArrayList<>();

    public void loadVeryImportantData() throws InterruptedException {
        this.importantData = "VERY VERY IMPORTANT DATA";

        domains.add("www.learncode.com");
        domains.add("www.svdsvd.com");
        domains.add("www.abd.com");
        domains.add("www.fdasa.com");

        Thread.sleep(2000);
        // SUPPOSE IT WILL TAKE SOME TIME
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", importantData='" + importantData + '\'' +
                ", domains=" + domains +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        // FOR DEEP COPY
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp(this.getIp());
        networkConnection.setImportantData(this.getImportantData());

        for (String d : this.getDomains()) {
            networkConnection.getDomains().add(d);
        }
        return networkConnection;

        // return super.clone(); FOR SHALLOW COPY
    }
}
