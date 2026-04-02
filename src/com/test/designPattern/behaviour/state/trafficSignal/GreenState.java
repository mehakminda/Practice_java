package com.test.designPattern.behaviour.state.trafficSignal;

public class GreenState implements TrafficLightState{
    @Override
    public void action(TrafficLight signal) {
        //go down behaviour
        System.out.println("GRREN");
        signal.setState(new RedState());
    }
}
