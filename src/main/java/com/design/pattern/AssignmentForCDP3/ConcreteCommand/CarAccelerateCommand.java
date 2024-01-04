package com.design.pattern.AssignmentForCDP3.ConcreteCommand;

import com.design.pattern.AssignmentForCDP3.Command.Command;
import com.design.pattern.AssignmentForCDP3.Receiver.Car;

public class CarAccelerateCommand implements Command {

    Car car;

    public CarAccelerateCommand(Car car){
        this.car = car;
    }

    @Override
    public void execute() {
        car.accelerate();
    }
}
