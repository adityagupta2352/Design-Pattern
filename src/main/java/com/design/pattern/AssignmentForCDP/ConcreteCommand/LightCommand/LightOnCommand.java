package com.design.pattern.AssignmentForCDP.ConcreteCommand.LightCommand;

import com.design.pattern.AssignmentForCDP.Receiver.Lights;
import com.design.pattern.AssignmentForCDP.command.Command;

public class LightOnCommand implements Command {

    Lights lights;

    public LightOnCommand(Lights lights){
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.lightOn();
    }
}
