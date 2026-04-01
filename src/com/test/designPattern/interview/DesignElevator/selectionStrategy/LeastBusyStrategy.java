package com.test.designPattern.interview.DesignElevator.selectionStrategy;

import com.test.designPattern.interview.DesignElevator.ElevatorController;
import com.test.designPattern.interview.DesignElevator.enums.ElevatorDirection;

import java.util.List;

public class LeastBusyStrategy implements ElevatorSelectionStrategy{
    @Override
    public ElevatorController selectElevator(List<ElevatorController> controllers, int requestFloor, ElevatorDirection direction) {

        ElevatorController best=null;
        int minLoad = Integer.MAX_VALUE;

        for(ElevatorController controller: controllers){
            int load = controller.upMinPQ.size() + controller.downMaxPQ.size();
            if( load< minLoad) {
                minLoad = load;
                best =controller;
            }
        }

        return best;
    }
}
