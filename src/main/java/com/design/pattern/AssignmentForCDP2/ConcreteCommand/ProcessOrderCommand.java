package com.design.pattern.AssignmentForCDP2.ConcreteCommand;

import com.design.pattern.AssignmentForCDP2.Command.Command;
import com.design.pattern.AssignmentForCDP2.Receiver.Operation;

public class ProcessOrderCommand implements Command {

    Operation operation;

    int hour;

    public ProcessOrderCommand(Operation operation , int hour){
        this.operation = operation;
        this.hour = hour;
    }


    @Override
    public void execute() {
        if (hour - operation.getInitialTime() >= 0) {
            operation.processOrder();
            operation.updateOrderStatus("ProcessOrderCommand");
        } else {
            System.out.println("Order processing is not allowed yet due to insufficient time.");
        }
    }
}
