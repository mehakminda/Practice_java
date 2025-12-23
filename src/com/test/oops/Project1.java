package com.test.oops;

import java.util.Scanner;

class Rectangle{
    float length;
    float breadth;
    float area;
    public void area(){
        System.out.println("Rentangle calculation");
        Scanner scan=new Scanner(System.in);
        System.out.println("Kindly enter the length of rectangle");
        length=scan.nextFloat();
        System.out.println("Kindly enter the breadth of rectangle");
        breadth=scan.nextFloat();

    }
    public void compute(){
        area=length*breadth;
    }
    public void disp(){
        System.out.println("The area is: "+area);
    }
}

class Circle{
    float radius;
    float area;
    public void input(){
        System.out.println("Circle calculation");
        Scanner scan=new Scanner(System.in);
        System.out.println("Kindly enter the radius of circle");
        radius=scan.nextFloat();
    }
    public void compute(){
        area= (float) (Math.PI )* radius * radius;
    }
    public void disp(){
        System.out.println("The area is: "+area);
    }
}

class Square{
    float length;
    float area;
    public void area(){
        System.out.println("Square calculation");
        Scanner scan=new Scanner(System.in);
        System.out.println("Kindly enter the length of Square");
        length=scan.nextFloat();


    }
    public void compute(){
        area=length*length;
    }
    public void disp(){
        System.out.println("The area is: "+area);
    }
}
public class Project1 {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        rectangle.area();
        rectangle.compute();
        rectangle.disp();

        Square  square=new Square();
        square.area();
        square.compute();
        square.disp();

        Circle circle=new Circle();
        circle.input();
        circle.compute();
        circle.disp();

    }
}
