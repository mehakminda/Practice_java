package com.test.oops;

import java.util.Scanner;

/**
 * Calculate the area of sq,rect,circle using Polymorphism
 */

class Geometry{
    void permit(Shape shape){
        shape.input();
        shape.compute();
        shape.disp();
    }
}

abstract class Shape{
    float area;
    abstract public void input();
    abstract public void compute();
     public void disp(){
         System.out.println("The area is: "+area);
    }
}
class Circle2 extends Shape{

    float radius;
    public void input() {

        System.out.println("Circle calculation");
        Scanner scan=new Scanner(System.in);
        System.out.println("Kindly enter the radius of circle");
        radius=scan.nextFloat();
    }

    public void compute() {
        area=(float) (Math.PI )* radius * radius;
    }

}

class Rectangle2 extends Shape{
    float length;
    float breadth;

    public void input() {
        System.out.println("Rentangle calculation");
        Scanner scan=new Scanner(System.in);
        System.out.println("Kindly enter the length of rectangle");
        length=scan.nextFloat();
        System.out.println("Kindly enter the breadth of rectangle");
        breadth=scan.nextFloat();
    }

    public void compute() {
        area=length*breadth;
    }

}
class Square2 extends Shape{
    float length;

    public void input() {
        System.out.println("Square calculation");
        Scanner scan=new Scanner(System.in);
        System.out.println("Kindly enter the length of Square");
        length=scan.nextFloat();
    }

    public void compute() {
        area=length*length;
    }
}

public class Project2 {
    public static void main(String[] args) {
        System.out.println("---Method1---");
        Geometry geometry=new Geometry();
        geometry.permit(new Rectangle2());

        System.out.println("---Method2---");
       new Geometry().permit(new Rectangle2());
       new Geometry().permit(new Square2());
       new Geometry().permit(new Circle2());
    }
}
