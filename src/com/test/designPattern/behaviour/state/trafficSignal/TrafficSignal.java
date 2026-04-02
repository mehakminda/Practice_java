package com.test.designPattern.behaviour.state.trafficSignal;

public class TrafficSignal {
    static void main(String args[]) {
        TrafficLight trafficLight =new TrafficLight(); //initial state is red

        trafficLight.change(); //red to yellow
        trafficLight.change();//yellow to green
        trafficLight.change(); //green to red

        //we just call change state, what state is next state that is defined internally

    }
}
//multiple states of one product, each having different action and different next state.
