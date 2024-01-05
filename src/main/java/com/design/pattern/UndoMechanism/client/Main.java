package com.design.pattern.UndoMechanism.client;

import com.design.pattern.UndoMechanism.concreteCommand.BoldCommand;
import com.design.pattern.UndoMechanism.concreteCommand.UndoCommand;
import com.design.pattern.UndoMechanism.invoker.History;
import com.design.pattern.UndoMechanism.receiver.HtmlDocument;

public class Main {

    public static void main(String[] args) {

        var history = new History();
        var document = new HtmlDocument();
        document.setContent("Hello World");

        var boldCommand = new BoldCommand(document , history);
        boldCommand.execute();
        System.out.println(document.getContent());

//        boldCommand.unexecute();
//        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }

}
