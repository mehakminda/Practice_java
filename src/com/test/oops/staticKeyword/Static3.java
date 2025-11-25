package com.test.oops.staticKeyword;

/**
 * Static variable is class independent, its value remains same across different object of class.
 *
 * Non static members variables cannot be inside static block. (they are created when object is created)
 * static block is executed before the non-static variables are created
 *
 *
 */
public class Static3 {
    int a,b;
    int count;
    static int count1;
    Static3(){
        System.out.println("Constructor");
        count++; count1++;
    }
    Static3(int a){
        this.a=a;
        System.out.println("Constructor");
        count++; count1++;
    }
    Static3(int a, int b){
        this.a=a;
        this.b=b;
        System.out.println("Constructor");
        count++; count1++;
    }

    public static void main(String[] args) {
        System.out.println(Static3.count1);
        Static3 st31=new Static3();
        System.out.println(Static3.count1);
        Static3 st32=new Static3(4);
        System.out.println(Static3.count1);
        Static3 st33=new Static3(10,20);

        System.out.println("Count1 :"+Static3.count1);
        System.out.println("Count :"+st33.count);

    }
}
