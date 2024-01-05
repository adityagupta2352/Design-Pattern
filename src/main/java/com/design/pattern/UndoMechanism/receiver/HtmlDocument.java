package com.design.pattern.UndoMechanism.receiver;

import lombok.Data;

@Data
public class HtmlDocument {

    private String content;

    public void makeBold(){
        content = "<b>" + content + "</b>";
    }

}
