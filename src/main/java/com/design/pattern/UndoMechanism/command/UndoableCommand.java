package com.design.pattern.UndoMechanism.command;

import com.design.pattern.UndoMechanism.command.Command;

public interface UndoableCommand extends Command {

    void unexecute();

}
