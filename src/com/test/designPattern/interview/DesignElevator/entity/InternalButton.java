package com.test.designPattern.interview.DesignElevator.entity;

import com.test.designPattern.interview.DesignElevator.ElevatorController;

public class InternalButton {
    private final ElevatorController controller;


    public InternalButton(ElevatorController controller) {
        this.controller = controller;
    }

    public void pressButton(int destinationFloor){
        controller.submitRequest(destinationFloor);
    }
}
