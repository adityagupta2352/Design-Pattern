package com.design.pattern.UndoMechanism.concreteCommand;

import com.design.pattern.UndoMechanism.command.Command;
import com.design.pattern.UndoMechanism.invoker.History;

public class UndoCommand implements Command {

    private History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if(history.size() > 0)
        history.pop().unexecute();
    }
}
