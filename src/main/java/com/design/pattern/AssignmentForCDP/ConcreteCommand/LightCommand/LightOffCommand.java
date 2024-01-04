package com.design.pattern.AssignmentForCDP.ConcreteCommand.LightCommand;

import com.design.pattern.AssignmentForCDP.Receiver.Lights;
import com.design.pattern.AssignmentForCDP.command.Command;

public class LightOffCommand implements Command {

    Lights lights;

    public LightOffCommand(Lights lights){
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.lightOff();
    }
}
