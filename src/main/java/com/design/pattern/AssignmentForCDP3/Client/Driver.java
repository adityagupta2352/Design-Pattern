package com.design.pattern.AssignmentForCDP3.Client;

import com.design.pattern.AssignmentForCDP3.ConcreteCommand.CarAccelerateCommand;
import com.design.pattern.AssignmentForCDP3.ConcreteCommand.CarDecelerate;
import com.design.pattern.AssignmentForCDP3.ConcreteCommand.CarStartCommand;
import com.design.pattern.AssignmentForCDP3.ConcreteCommand.CarStopCommand;
import com.design.pattern.AssignmentForCDP3.Invoker.CarOperationManager;
import com.design.pattern.AssignmentForCDP3.Receiver.Car;

public class Driver {

    public static void main(String[] args) {

        CarOperationManager carOperationManager = new CarOperationManager();

        Car car = new Car();

        carOperationManager.setCommand(new CarStartCommand(car));
        carOperationManager.performOperation();

        carOperationManager.setCommand(new CarAccelerateCommand(car));
        carOperationManager.performOperation();

        carOperationManager.setCommand(new CarDecelerate(car));
        carOperationManager.performOperation();

        carOperationManager.setCommand(new CarStopCommand(car));
        carOperationManager.performOperation();
    }

}
