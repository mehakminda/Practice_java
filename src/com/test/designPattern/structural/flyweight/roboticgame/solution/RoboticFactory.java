package com.test.designPattern.structural.flyweight.roboticgame.solution;

import java.util.HashMap;

// Flyweight Factory (Class) - creates and manages flyweight objects
public class RoboticFactory{

    static HashMap<String, IRobot> robotObjectCache = new HashMap<>();

    public static IRobot createRobot(String robotType) throws IllegalAccessException {
        if(robotObjectCache.containsKey(robotType)){
            // if exists, return the cached object.
            return robotObjectCache.get(robotType);
        }
        else {
            // if not exists, create the object and cache it.
            if (robotType.equals("HUMANOID")) {
                Sprites humanoidSprite = new Sprites();
                IRobot humanoidObject = new HumanoidRobot(robotType, humanoidSprite);
                // add to cache
                robotObjectCache.put(robotType, humanoidObject);
                return humanoidObject;
            } else if (robotType.equals("ROBOTIC_DOG")) {
                Sprites roboticDogSprite = new Sprites();
                IRobot roboticDogObject = new RoboticDog(robotType, roboticDogSprite);
                // add to cache
                robotObjectCache.put(robotType, roboticDogObject);
                return roboticDogObject;

            }
        }
        throw new IllegalAccessException("Invalid robot Type: "+ robotType);
    }
    public static int getTotalRobots(){
        return robotObjectCache.size();
    }
}
