package com.test.core.MscPackage;

import java.math.BigDecimal;
import java.util.*;
class BigDecimalClass{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=5;String []s={"90","0.12",".12","02.34", "000.000"};

        sc.close();

        //Write your code here
        //O(n*n)
        for(int i=0;i<s.length-1;i++){
            for(int j=i+1;j<s.length;j++){
                BigDecimal a= new BigDecimal(s[i]);
                BigDecimal b= new BigDecimal(s[j]);

                if(a.compareTo(b)<0) {
                    // Swap the strings in the array
                    String temp = s[i];
                    s[i]= s[j];
                    s[j] = temp;
                }
            }

        }

        //try buble sort

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}