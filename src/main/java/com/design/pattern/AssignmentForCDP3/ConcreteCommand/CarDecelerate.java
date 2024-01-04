package com.design.pattern.AssignmentForCDP3.ConcreteCommand;

import com.design.pattern.AssignmentForCDP3.Command.Command;
import com.design.pattern.AssignmentForCDP3.Receiver.Car;

public class CarDecelerate implements Command {

    Car car;

    public CarDecelerate(Car car){
        this.car = car;
    }


    @Override
    public void execute() {
        car.decelerate();
    }
}
