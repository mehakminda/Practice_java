package com.test.core.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsPractice {
    static void main() {
       // List<Integer> list = Arrays.asList(1,3,4,5,6,7,1,2,3,4,5,6,7,8,2,2,9,4);
        List<Integer> list = Arrays.asList(1,3,8,2,2,9,4);
        Stream<Integer> s = list.stream();
        //System.out.println(s.count());
       // System.out.println(s.count()); //error

        Stream<Integer> s2 = s.filter(i->i%2==0);

        s2.forEach(i-> System.out.print(i + " "));
        System.out.println();

        //functional interface - 1 method
        Predicate<Integer> predicateObj = new Predicate<Integer>(){
            public boolean test(Integer integer){

                if(integer %2==0) return true;
                return false;
            }
        };

        Stream<Integer> s3=list.stream().filter(predicateObj);
        s3.forEach(i-> System.out.print(i + " "));
        System.out.println();


        //using lamba expression
        Predicate<Integer> predicateObj1 = i -> i %2==0;

        Stream<Integer> s4=list.stream().filter(predicateObj1);
        s4.forEach(i-> System.out.print(i + " "));
        System.out.println();


        Function<Integer, Integer> funcObj = new Function<Integer,Integer>() { //<Input type, output type>
            @Override
            public Integer apply(Integer num) {
                return num*2;
            }
        };

        Stream<Integer> s5 = list.stream().filter(i->i%2==0).map(funcObj );
        s5.forEach(i-> System.out.print (i+" "));
        System.out.println();

        list.stream().filter(i->i%2==0).map( i->i*2 ).forEach(i-> System.out.print(i +" "));
        System.out.println();

        BinaryOperator<Integer> binaryOperatorObj =new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        };

        int sum1 = list.stream().filter(i->i%2==0).map(i->i*2).reduce(0,binaryOperatorObj);
        System.out.println(sum1);
        //outpur of reduce is sinlg evalue of the type of stream.



        BinaryOperator<Integer> binaryOperatorObj1 = (i, i2) -> i+i2;
        int sum2 = list.stream().filter(i->i%2==0).map(i->i*2).reduce(0,binaryOperatorObj1);
        System.out.println(sum2);

        int sum3=list.stream().filter(i->i%2==0).map(i->i*2).reduce(0,(c,e)->c+e);
        System.out.println(sum3);

    }
}
