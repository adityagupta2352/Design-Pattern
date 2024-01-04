package com.design.pattern.AssignmentForCDP.Client;

import com.design.pattern.AssignmentForCDP.ConcreteCommand.LightCommand.LightOnCommand;
import com.design.pattern.AssignmentForCDP.ConcreteCommand.SecurityCamerasCommand.ActivateCommand;
import com.design.pattern.AssignmentForCDP.ConcreteCommand.SmartLocksCommand.LockSmartLockCommand;
import com.design.pattern.AssignmentForCDP.ConcreteCommand.ThermostatCommand.SetTemperatureCommand;
import com.design.pattern.AssignmentForCDP.Invoker.Controller;
import com.design.pattern.AssignmentForCDP.Receiver.Lights;
import com.design.pattern.AssignmentForCDP.Receiver.SecurityCameras;
import com.design.pattern.AssignmentForCDP.Receiver.SmartLocks;
import com.design.pattern.AssignmentForCDP.Receiver.Thermostat;

public class UserClass {

    public static void main(String[] args) {

        Controller controller  = new Controller();

        Lights lights = new Lights();
        controller.setCommand(new LightOnCommand(lights));
        controller.pressButton();

        SecurityCameras securityCameras =  new SecurityCameras();
        controller.setCommand(new ActivateCommand(securityCameras));
        controller.pressButton();

        SmartLocks smartLocks = new SmartLocks();
        controller.setCommand(new LockSmartLockCommand(smartLocks));
        controller.pressButton();

        Thermostat thermostat = new Thermostat();
        controller.setCommand(new SetTemperatureCommand(thermostat));
        controller.pressButton();
    }

}
