package com.design.pattern.AdaptorPattern;

public class JSONSoftware implements JSONData{
    @Override
    public void readJSONData() {
        System.out.println("UNDERSTAND ONLY JSON DATA");
    }
}
