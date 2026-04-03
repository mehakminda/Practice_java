package com.test.designPattern.structural.flyweight.roboticgame.problem;


// Client Code - Robotic game creating robots
public class Demo {
    static void main() {
        int x = 0;
        int y = 0;
        //Creating 5L Humanoids Robots
        for(int i=0 ; i < 500000 ; i++){
            Sprites humanoidSprite = new Sprites();
            Robot humanoidsRobotObj = new Robot(x,y,"HUMANOID", humanoidSprite);
        }



        //Creating 5L Robotic Dog Robots
        for (int i = 0; i < 500000; i++) {
            Sprites roboticDogSprite = new Sprites();
            Robot roboticDogObject = new Robot(x + i, y + i, "ROBOTIC_DOGS", roboticDogSprite);
        }
        // A total of 10L robots created will result in 10L Sprite objects created
        // which will consume a lot of memory.
        System.out.println("test");


    }
}
