package com.test.core.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * scanner class in java, scans input streams..
 *
 * Collection vs Stream
 *
 * Let say we want to print sum of double of even number of a collection
 *
 * Stream, Filter, map
 */
public class Streams1 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,3,6,1,7,2,8,4,9,3,8,3,4,5,6,7,3,4);


        //method 1
        System.out.println("List: "+list);
        int sum=0;
        for(int nums:list){
            if(nums%2==0){
                nums=nums*2;
                sum=sum+nums;
            }
        }
        System.out.println("Sum with method1 is: "+sum);
        System.out.println("-----------------------------------\n");

        //method2
        Stream<Integer> stream=list.stream(); //there is a default method called stream() in Collection Interface which returns Streams
       // System.out.println("Count of elements in list: " +stream.count());

        //gets the element of list using stream

        System.out.print("List elements: ");
        stream.forEach(i-> System.out.print(i+ " "));
        System.out.println();
       // stream.forEach(i-> System.out.print(i)); //gives exception IllegalStateException: stream has already been operated upon or closed.
        //****** WE CANNOT READ THE STREAM TWICE. *******


        Stream<Integer> stream2=list.stream(); //creating a new stream on same list and read list data
        System.out.print("List elements: ");
        stream2.forEach(i-> System.out.print(i+" "));
        System.out.println();


        //Lets solve our problem of 'sum of double of even  number in a list'.
        Stream<Integer> stream3=list.stream();
        Stream<Integer> stream4=list.stream();
        Stream<Integer> stream5=list.stream();

        //Create a predicate object, so that it can be passed in filter method
        // it a functional interface, so we need to define the only method when we create the object
        //predicate method1
        Predicate<Integer> predicate= new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%2==0;
            }
        };
        //predicate method2 - use lamba expressions
        Predicate<Integer> predicate2= (Integer integer) ->{
                return integer%2==0;
        };

        //predicate method3
       // Predicate<Integer> predicate3= (Integer integer) -> integer%2==0 ;

        //predicate method4
        //Predicate<Integer> predicate4= integer-> integer%2==0 ;

        //predicate method5
        Predicate<Integer> predicate4= i-> i%2==0 ;


        //using filter- method1
        Stream<Integer> filterStream=stream3.filter(predicate); //filter method takes object of predicate interface and returns a stream
        // Predicate interface is a functional interface- has 1 method called test. Test method takes one variable of type Generic
        //functional programming - passing function as parameter/ assigning function to a variable
        //We can pass any of the above predicate objects

        System.out.print("Print filtered Even values from stream: ");
        filterStream.forEach(i-> System.out.print(i+" "));
        System.out.println();

        //using filter- method2
        Stream<Integer> filterStream2=stream4.filter(predicate4);

        //using filter- method3
        Stream<Integer> filterStream3=stream5.filter(i-> i%2==0);

        //changing value

        Function<Integer,Integer> fun =new Function<Integer, Integer>(){
            public Integer apply(Integer num){
                return num*2;
            }
        };

        Stream<Integer> mappedStream1= filterStream2.map(fun); //map method takes a object Function interface and returns a stream
        //Function interface is a functional interface having a method apply method
        // apply method is output type apply (input type );
        //Function <input type, output type>
        // in map we can pass integer and get a double

        System.out.print("Print doubled mapped values of  Even values from stream: ");
        mappedStream1.forEach(i-> System.out.print(i+" "));
        System.out.println();

        //after further refining above can be written as this:
        Stream<Integer> mappedStream2= filterStream3.map(i->i*2);

        //summing the doubled value
        //mappedStream2.


    }
}
