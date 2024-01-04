package com.design.pattern.AssignmentForCDP2.ConcreteCommand;

import com.design.pattern.AssignmentForCDP2.Command.Command;
import com.design.pattern.AssignmentForCDP2.Receiver.Operation;

import javax.xml.crypto.Data;
import java.time.LocalTime;

public class InitiateOrderCommand implements Command {

    Operation operation;

    int initialTime;

    public InitiateOrderCommand(Operation operation , int initialTime){
        this.operation = operation;
        this.initialTime = initialTime;
    }


    @Override
    public void execute() {
        operation.initiateOrder();
        operation.setInitialTime(initialTime);
        operation.updateOrderStatus("InitiateOrderCommand");
    }
}
