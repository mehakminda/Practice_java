package com.test.designPattern.structural.flyweight.roboticgame.problem;

 // Robot class - Used to create Humanoid and Robotic Dog robots
public class Robot {
    int coordinateX;
    int coordinateY;
    String type;
    Sprites body; // heavy-weight object - 2D bitmap image

     public Robot(int coordinateX, int coordinateY, String type, Sprites body) {
         this.coordinateX = coordinateX;
         this.coordinateY = coordinateY;
         this.type = type;
         this.body = body;
     }

     // getters and setters
 }

