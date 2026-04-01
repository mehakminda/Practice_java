package com.test.designPattern.interview.DesignElevator.selectionStrategy;

import com.test.designPattern.interview.DesignElevator.ElevatorController;
import com.test.designPattern.interview.DesignElevator.enums.ElevatorDirection;

import java.util.List;

public interface ElevatorSelectionStrategy {
    ElevatorController selectElevator(List<ElevatorController> controllers, int requestFloor, ElevatorDirection direction);
}
