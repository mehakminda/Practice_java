package com.test.designPattern.behaviour.state.trafficSignal;

public class TrafficLight {
    private TrafficLightState state;


    public TrafficLight(){
        this.state = new RedState(); //initial state
    }

    public void setState(TrafficLightState state){
        this.state=state;
    }
    public void change(){
        state.action(this);

    }
}
