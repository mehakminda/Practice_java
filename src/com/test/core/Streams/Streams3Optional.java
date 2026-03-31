package com.test.core.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Streams3Optional {
    static void main() {
        List<String> list1 = Arrays.asList("jolo", "miley","selena","ellina");
        String name=null;
        for (String s:list1){
            if(s.contains("j")){
                name=s;
                break;
            }
        }
        if(name !=null) //possibility of nullpointerexception hence we write a null check
            System.out.println(name +" : "+ name.length());

        //method2 using optional
        Optional<String> nameOpt = list1.stream().filter(n->n.contains("p")).findFirst();

        System.out.println(nameOpt); //Optional.empty (or) Optional[jolo]
        //System.out.println(nameOpt.get());//still gives error : NoSuchElementException
        System.out.println(nameOpt.orElse("Not Found"));//handles nullcheck internally


        //method3
        String name3=list1.stream().filter(n->n.contains("j")).findFirst().orElse("No value");
        System.out.println(">> "+name3);
    }
}
