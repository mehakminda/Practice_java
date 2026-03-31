package com.test.core.Streams;

import java.util.Arrays;
import java.util.List;

public class Streams2 {
    static void main() {
        //Parallel stream

        List<Integer> list = Arrays.asList(1,3,8,2,2,9,4);

        long start =System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        int sum1 = list.parallelStream().filter(i -> i % 2 == 0)
                .map(i -> i * 2).reduce(0,(c,e) -> c+e);
        //System.out.println(sum1);
        long end1=System.currentTimeMillis();

        //System.out.println(System.currentTimeMillis());

        int sum2 = list.parallelStream().filter(i -> i % 2 == 0)
                .map(i -> i * 2).reduce(0,(c,e) -> c+e);
       // System.out.println(sum2);
       // System.out.println(System.currentTimeMillis());
        long end2=System.currentTimeMillis();
        System.out.println(" streams took "+(end1-start) +" ms");
        System.out.println(" parallel streams took "+(end2-end1) + " ms");

    }
}
