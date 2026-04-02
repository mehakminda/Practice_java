package com.test.designPattern.behaviour.state.trafficSignal;

public class RedState implements TrafficLightState{
    @Override
    public void action(TrafficLight signal) {
        //stop down behaviour
        //do image processing by camera
        System.out.println("RED");
        signal.setState(new YellowState());
    }
}
