package com.design.pattern.CommandDesignPattern;

public class TubeLightOffCommand implements Command{

    TubeLight tubeLight;

    TubeLightOffCommand(TubeLight tubeLight){
        this.tubeLight = tubeLight;
    }

    @Override
    public void execute(){
        tubeLight.SwithOff();
    }

}
