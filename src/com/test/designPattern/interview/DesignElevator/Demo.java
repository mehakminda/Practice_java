package com.test.designPattern.interview.DesignElevator;

import com.test.designPattern.interview.DesignElevator.entity.ElevatorCar;
import com.test.designPattern.interview.DesignElevator.entity.InternalButton;
import com.test.designPattern.interview.DesignElevator.selectionStrategy.NearestElevatorStrategy;

import java.util.Arrays;

public class Demo {
    static void main(String args[]) {

        try {

            // Create Elevator cars and their controllers
            ElevatorCar car1 = new ElevatorCar(1);
            ElevatorController controller1 = new ElevatorController(car1);

            ElevatorCar car2 = new ElevatorCar(2);
            ElevatorController controller2 = new ElevatorController(car2);

            //create one internal button for each elevator
            InternalButton internalButton_for_elevator1 = new InternalButton(controller1);
            InternalButton internalButton_for_elevator2 = new InternalButton(controller2);

            //create scheduler near strategy
            ElevatorScheduler elevatorScheduler = new ElevatorScheduler(
                    Arrays.asList(controller1,controller2),new NearestElevatorStrategy());

            //create external dispatcher
            ExternalDispatcher externalDispatcher = new ExternalDispatcher(elevatorScheduler);

            //create 5 floors building
            Building building = new Building(5, externalDispatcher);

            //start both the elevator controller threads
            new Thread(controller1,"Elevator-1").start();
            new Thread(controller2, "Elevator-2").start();


            // Lets submit the requests
                /*
                    1. External Call : Floor 3 UP
                    2. External Call : Floor 5 DOWN
                    3. Internal Call : Elevator 1 (press 4)
                    4. Internal Call : Elevator 1 (press 5)
                    5. External Call : Floor 1 DOWN
                    6. External Call : Floor 2 UP
                 */

            building.getFloor(3).pressUpButton();
            Thread.sleep(5);

            building.getFloor(5).pressDownButton();
            Thread.sleep(5);

            internalButton_for_elevator1.pressButton(4);
            Thread.sleep(5);

            internalButton_for_elevator1.pressButton(5);
            Thread.sleep(5);

            building.getFloor(1).pressDownButton();
            Thread.sleep(5);

            building.getFloor(2).pressUpButton();
            Thread.sleep(5);

            internalButton_for_elevator1.pressButton(2);



        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
