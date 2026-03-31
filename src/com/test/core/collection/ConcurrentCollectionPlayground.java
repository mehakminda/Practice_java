package com.test.core.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCollectionPlayground {
    static void main() {

        /**
         * ConcurrentMap: ConcurrentHashMap
         * ConcurrentSet: CopyOnWriteArraySet
         * ConcurrentList: CopyOnWriteArray
         */
        ConcurrentHashMap chm1=new ConcurrentHashMap<>();
        chm1.putIfAbsent(101, "Minda");
        chm1.putIfAbsent(101,"lol" );

        chm1.put(102, "world");
        chm1.put(102,"heaven" );
        //put , it will replace 101 with new value
        System.out.println(chm1);


        //concurrenthashmap creates read-onlycopy

       /* HashMap hm2=new HashMap();
        hm2.put(1,"air");
        hm2.put(2,"water");
        Iterator itr=hm2.keySet().iterator();
        hm2.put(3,"space");
        while(itr.hasNext()){
            System.out.println(itr.next() +" "); //ConcurrentModificationException
        }
        System.out.println(hm2);*/

        ConcurrentHashMap chm2=new ConcurrentHashMap();
        chm2.put(1,"air");
        chm2.put(2,"water");
        Iterator itr2=chm2.keySet().iterator();
        chm2.put(3,"space");
        while(itr2.hasNext()){
            System.out.println(itr2.next() +" ");
        }
        System.out.println(chm2);

        //HashMap:
        //ConcurrentHashMap:
        //SyncMap

        System.out.println("----------  -----------");
        CopyOnWriteArrayList cArrList = new CopyOnWriteArrayList<>();
        cArrList.add("A");
        cArrList.add("A");
        cArrList.addIfAbsent("B");
        cArrList.addIfAbsent("B");
        System.out.println(cArrList);

    }
}
