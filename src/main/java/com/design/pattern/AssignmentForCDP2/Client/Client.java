package com.design.pattern.AssignmentForCDP2.Client;

import com.design.pattern.AssignmentForCDP2.ConcreteCommand.CancelOrderCommand;
import com.design.pattern.AssignmentForCDP2.ConcreteCommand.InitiateOrderCommand;
import com.design.pattern.AssignmentForCDP2.ConcreteCommand.ProcessOrderCommand;
import com.design.pattern.AssignmentForCDP2.Invoker.OperationManager;
import com.design.pattern.AssignmentForCDP2.Receiver.Operation;

import java.time.LocalTime;

public class Client {

    public static void main(String[] args) {

        OperationManager operationManager = new OperationManager();

        Operation operation = new Operation();

        int hour = LocalTime.MAX.getHour();
        operationManager.setOperation(new InitiateOrderCommand(operation , hour));
        operationManager.pressButton();

        hour = LocalTime.MAX.getHour();
        operationManager.setOperation(new ProcessOrderCommand(operation , hour));
        operationManager.pressButton();

        operationManager.setOperation(new CancelOrderCommand(operation));
        operationManager.pressButton();

    }

}
