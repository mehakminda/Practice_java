package com.test.designPattern.interview.DesignElevator;

import com.test.designPattern.interview.DesignElevator.enums.ElevatorDirection;

public class ExternalDispatcher {
    ElevatorScheduler elevatorScheduler;

    public ExternalDispatcher(ElevatorScheduler elevatorScheduler) {
        this.elevatorScheduler = elevatorScheduler;
    }

    public void submitExternalRequest(int floor, ElevatorDirection direction){
        ElevatorController controller = elevatorScheduler.assignElevator(floor,direction);
        controller.submitRequest(floor);
    }
}
