package com.test.designPattern.behaviour.state.trafficSignal;

public class YellowState implements TrafficLightState{
    @Override
    public void action(TrafficLight signal) {
        //slow down behaviour
        System.out.println("YELLOW");
        signal.setState(new GreenState());
    }
}
