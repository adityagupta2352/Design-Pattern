package com.design.pattern.AssignmentForCDP2.Invoker;

import com.design.pattern.AssignmentForCDP2.Command.Command;

public class OperationManager {

    Command command;

    public OperationManager(){
    }

    public void setOperation(Command command){
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }

}
