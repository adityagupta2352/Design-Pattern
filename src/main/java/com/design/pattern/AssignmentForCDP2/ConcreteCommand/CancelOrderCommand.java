package com.design.pattern.AssignmentForCDP2.ConcreteCommand;

import com.design.pattern.AssignmentForCDP2.Command.Command;
import com.design.pattern.AssignmentForCDP2.Receiver.Operation;

public class CancelOrderCommand implements Command {

    Operation operation;

    public CancelOrderCommand(Operation operation){
        this.operation = operation;
    }


    @Override
    public void execute() {
        operation.cancleOrder();
        operation.updateOrderStatus("CancelOrderCommand");
        operation.refundPayment();
    }
}
