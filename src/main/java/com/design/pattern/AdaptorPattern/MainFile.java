package com.design.pattern.AdaptorPattern;

public class MainFile {

    public static void main(String[] args) {

        XMLSoftware xmlSoftware = new XMLSoftware();

        JSONData XmlAdaptor = new XMLToJSONDataAdaptor(xmlSoftware);

        XmlAdaptor.readJSONData();
    }

}
