package com.design.pattern.AssignmentForCDP.ConcreteCommand.ThermostatCommand;

import com.design.pattern.AssignmentForCDP.Receiver.Thermostat;
import com.design.pattern.AssignmentForCDP.command.Command;

public class SetTemperatureCommand implements Command {

    Thermostat thermostat;

    public SetTemperatureCommand(Thermostat thermostat){
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.setTemperature();
    }
}
