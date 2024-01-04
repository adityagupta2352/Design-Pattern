package com.design.pattern.AdaptorPattern;

public class XMLSoftware implements XMLDate{

    @Override
    public void readXMLDate() {
        System.out.println("UNDERSTAND ONLY XML DATA");
    }
}
