package com.design.pattern.AssignmentForCDP.ConcreteCommand.SecurityCamerasCommand;

import com.design.pattern.AssignmentForCDP.Receiver.SecurityCameras;
import com.design.pattern.AssignmentForCDP.command.Command;

public class DeactivateCommand implements Command {

    SecurityCameras securityCameras;

    public DeactivateCommand(SecurityCameras securityCameras){
        this.securityCameras = securityCameras;
    }

    @Override
    public void execute() {
        securityCameras.Deactivate();
    }
}
