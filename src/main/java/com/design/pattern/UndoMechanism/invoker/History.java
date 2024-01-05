package com.design.pattern.UndoMechanism.invoker;

import com.design.pattern.UndoMechanism.command.UndoableCommand;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {

    private Deque<UndoableCommand> commandList = new ArrayDeque<>();

    public void push(UndoableCommand command){
        commandList.add(command);
    }

    public UndoableCommand pop(){
        return commandList.pop();
    }

    public int size(){
        return commandList.size();
    }

}

