package com.design.pattern.AssignmentForCDP.Invoker;

import com.design.pattern.AssignmentForCDP.command.Command;

public class Controller {

    Command command;

    public Controller(){

    }

    public void setCommand(Command command){
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }

}
