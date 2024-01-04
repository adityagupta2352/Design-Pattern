package com.design.pattern.AssignmentForCDP.ConcreteCommand.SmartLocksCommand;

import com.design.pattern.AssignmentForCDP.Receiver.SmartLocks;
import com.design.pattern.AssignmentForCDP.command.Command;

public class UnlockSmartLockCommand implements Command {

    SmartLocks smartLocks;

    public UnlockSmartLockCommand(SmartLocks smartLocks){
        this.smartLocks = smartLocks;
    }

    @Override
    public void execute() {
        smartLocks.UnlockSmartLock();
    }
}
