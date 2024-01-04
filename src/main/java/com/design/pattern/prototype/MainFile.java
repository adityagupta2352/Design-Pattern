package com.design.pattern.prototype;

public class MainFile {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Creating object using prototype");

        NetworkConnection networkConnection = new NetworkConnection();

        networkConnection.setIp("192.168.4.4");
        networkConnection. loadVeryImportantData();

        System.out.println(networkConnection);

        // WE WANT NEW OBJECT OF NETWORK CONNECTION
        try {
            NetworkConnection networkConnection1 = (NetworkConnection) networkConnection.clone();
            NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();

            networkConnection.getDomains().remove(0);

            System.out.println(networkConnection);
            System.out.println(networkConnection1);
            System.out.println(networkConnection2);
        } catch (CloneNotSupportedException cloneNotSupportedException) {
            cloneNotSupportedException.printStackTrace();
        }
    }

}
