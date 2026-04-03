package com.test.designPattern.behaviour.command.solution;

public class AcConditioner {
    boolean isOn;
    int temperature;

    public void turnOn(){
        isOn = true;
        System.out.println("Air conditioner is on");
    }

    public void turnOff(){
        isOn = false;
        System.out.println("Air conditioner is off");
    }


    public void setTemperature(int temperature){
        this.temperature = temperature;
        System.out.println("Ait conditioner temperature set to "+ temperature );
    }

    public int getTemperature(){
        return temperature;

    }

}
