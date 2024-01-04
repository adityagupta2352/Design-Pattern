package com.design.pattern.AdaptorPattern;

public class XMLToJSONDataAdaptor implements JSONData{

    XMLDate xmlDate;

    XMLToJSONDataAdaptor(XMLDate xmlDate){
        this.xmlDate = xmlDate;
    }

    @Override
    public void readJSONData() {

        xmlDate.readXMLDate();
        System.out.println("Convert here XML data to JSON data");

    }
}
