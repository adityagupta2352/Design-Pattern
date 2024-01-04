package com.design.pattern.AssignmentForCDP3.Invoker;

import com.design.pattern.AssignmentForCDP3.Command.Command;

public class CarOperationManager {

    Command command;

    public CarOperationManager(){}

    public void setCommand(Command command){
        this.command = command;
    }

    public void performOperation(){
        command.execute();
    }
}
