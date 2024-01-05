package com.design.pattern.UndoMechanism.concreteCommand;

import com.design.pattern.UndoMechanism.invoker.History;
import com.design.pattern.UndoMechanism.command.UndoableCommand;
import com.design.pattern.UndoMechanism.receiver.HtmlDocument;

public class BoldCommand implements UndoableCommand {

    private String prevContent;

    private HtmlDocument htmlDocument;

    private History history;

    public BoldCommand(HtmlDocument htmlDocument, History history) {
        this.htmlDocument = htmlDocument;
        this.history = history;
    }

    @Override
    public void execute() {
         prevContent = htmlDocument.getContent();
         htmlDocument.makeBold();
         history.push(this);
    }

    @Override
    public void unexecute() {
        htmlDocument.setContent(prevContent);
    }
}
