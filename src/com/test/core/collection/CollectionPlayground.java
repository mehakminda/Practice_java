package com.test.core.collection;

import java.util.*;

public class CollectionPlayground {
    static void main() throws InterruptedException {
        //List: ArrayList, LinkedArrayList, Vector,Stack
        //Set: HashSet, LinkedHashSet, SortedSet, TreeSet
        //Queue: PriorityQueue, priorityBlockingQueue, LinkedBlockingQueue
        //Deque: ArrayDeque
        //Map: HashMap, LinkedHashMap,WeakMap, IdentityMap, SortedMap, TreeMap

        System.out.println("----------  ArrayList ----------");
        List list1=new ArrayList();
        list1.add(10);
        list1.add(1);
        list1.add(10);
        list1.add("Apple");
        list1.addAll(2,List.of(20,30,40));
        list1.addFirst(60);
        list1.addLast(80);
        System.out.println(list1);
        System.out.println(list1.add(250));
        //System.out.println(list1.remove(20)); //IndexOutofBoundException
        System.out.println(list1.remove(2));//value
        System.out.println(list1.containsAll(List.of(20,10))); //all are present
        System.out.println(list1.containsAll(List.of(10,800)));//800 is not present
        System.out.println(list1);
        System.out.println(list1.getLast());
        System.out.println(list1.getLast());
        System.out.println(list1.getClass());
        System.out.println(list1.reversed());
        System.out.println(list1.hashCode());
        List l1= Collections.synchronizedList(list1);
        //Duplicates allowed, Insertion order preserved, Heterogeneous
        //Non-sync, Cloneable, Serializable, RandomAccess,



        System.out.println("---------- Linked List ----------");
        List list2 =new LinkedList();
        list2.add(100);
        list2.addFirst(20);
        list2.addLast(300);
        list2.addAll(2,List.of(22,33));
        list2.addAll(List.of(21,2));
        System.out.println(list2);
        System.out.println(list2.reversed());
        System.out.println(list2.getFirst());
        System.out.println(list2.getLast());
        System.out.println(list2.getClass());
        System.out.println(list2.reversed());

        //Duplicate allowed, Insertion order preserved, heterogeneous
        //Cloneable, Serializable


        System.out.println("---------- Vector ----------");
        Vector vector = new Vector<>();
        System.out.println(vector.capacity());
        vector.add(20);
        vector.addFirst(200);
        vector.addAll(List.of(20,30,40));
        vector.addAll(3,List.of(20,30,40,50,60));
        vector.add(2,50);
        vector.remove(3);
        System.out.println(vector);
        System.out.println(vector.size());
        System.out.println(vector.capacity());
        System.out.println(vector.getClass());

        //Duplicates allowed, Insertion order preserved, Heterogeneous
        //sync, Cloneable, Serializable, RandomAccess, capacity


        System.out.println("---------- Stack ----------");
        Stack stack = new Stack();
        stack.add(10);
        stack.add(20);
        stack.add(2,30);
        System.out.println(stack);
        System.out.println(stack.peek()); //just return the top element
        Object x=stack.pop(); //removed and return top element
        System.out.println(x);
        System.out.println(stack);
        System.out.println(stack.getClass());
        stack.push(800);
        System.out.println(stack);

        //Cursors: Enumeration, Iterator, ListIterator

        System.out.println("---------- Enumeration ----------");
        System.out.println(vector);
        Enumeration e= vector.elements();
        while(e.hasMoreElements()){
            System.out.print(e.nextElement() +" ");
        }
        System.out.println();
        //legacy clases, unidirection, only read operation

        System.out.println("---------- ListIterator ----------");
        System.out.println(list2);
        ListIterator litr2=list2.listIterator();
        while(litr2.hasNext()){
            Integer li = (Integer)litr2.next();
            if(li%11 == 0){
                litr2.remove();

            }
            else if(li % 2 ==0){
                litr2.add(3);
            }

        }
        System.out.println(list2); //in-place replacement

        //only list objects, bidirectional, read, replace, add, remove


        System.out.println("---------- Iterator ----------");
        System.out.println(list1);
        Iterator itr=list1.iterator();
        while( itr.hasNext() ){
            Object it= (Object) itr.next();
            System.out.print( it.hashCode() +": ");
            if(it instanceof String){
                itr.remove();
            }
            else{
                System.out.print(it+" ");
            }

        }
        System.out.println();

        //all objects, read, remove

        System.out.println(e.getClass());
        System.out.println(itr.getClass());
        System.out.println(litr2.getClass());


        System.out.println("-------------------- Set --------------------");
        System.out.println("---------- HashSet ----------");

        //implemented based on a hashtable, duplicate not allowed, insertion order not maintained
        //  Serializable and Cloneable

        System.out.println("---------- LinkedHashSet ----------");

        //implemented based on a hashtable & LinkedList, duplicate not allowed, insertion order maintained
        // Serializable and Cloneable


        System.out.println("---------- SortedSet ----------");

        System.out.println("---------- TreeSet ----------");
        //implemented based on a BalancedTree, duplicate not allowed, insertion order not maintained
        //is sorted,  Serializable and Cloneable

        //Comparable and comparator.


        System.out.println("-------------------- Map --------------------");
        System.out.println("---------- HashMap ----------");
        HashMap hm = new HashMap();
        hm.put(1,"mehak");
        hm.put(2,"mehak");
        hm.put(3,"apple");
        hm.put(4,"apple");
        hm.put(5,6);
        hm.put(6.1,3.4);
        hm.putAll(Map.of("1","2","2","3"));
        System.out.println(hm.put("e","ell"));
        System.out.println(hm.put("e","elina")); //returns previous value before replacing
        hm.remove(4);
        Collection c = hm.values();
        System.out.println(c);
        Set s2 = hm.keySet();
        System.out.println(s2);
        Set s = hm.entrySet();
        System.out.println(s);
        Iterator itr2=s.iterator();
        while(itr2.hasNext()){
            Map.Entry m1=(Map.Entry)itr2.next();
            System.out.println(m1.getKey()+"..."+m1.getValue());
            if(m1.getValue().equals("mehak")){
                m1.setValue("mehak is winner");
            }
        }
        System.out.println(hm);

        //based on hashtable, insertion order not maintained
        //duplicate keys allowed but not values, non-sync


        System.out.println("---------- IdentityMap ----------");

        //same as that of hashmap except that
        //hashmap uses equals to avoid duplicate keys,
        //identityhashmap uses == to identity duplicate keys, ie reference comparision

        HashMap hm1=new HashMap();
        IdentityHashMap ihm1=new IdentityHashMap();
        Integer i1=new Integer(10);
        Integer i2=new Integer (10);
        hm1.put(i1, "Hello");
        hm1.put(i2,"lol");
        ihm1.put(i1, "Hello");
        ihm1.put(i2,"lol");
        ihm1.put(10,"lol2");
        System.out.println(hm1); //{10=lol}
        System.out.println(ihm1); //{10=Hello, 10=lol}

        System.out.println("---------- WeakHashMap ----------");
        //same as that of hashmap
        //hashmap dominates Gc, ie if there is any rereferenless hashmap, gc will not remove it
        //weakhashmap will get deleted if there is not reference, gc dominates weakhashmap

        HashMap hm2=new HashMap();
        Temp t=new Temp();
        hm2.put(t,"Minda");
        System.out.println(hm2); //{Temp=Minda}
        t=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(hm2); //{Temp=Minda}


        WeakHashMap whm=new WeakHashMap<>();
        Temp t2=new Temp();
        whm.put(t2,"Minda");
        System.out.println(whm);
        t2=null;
        System.gc();
        Thread.sleep(5000); //{Temp=Minda}
        System.out.println(whm); //empty gc works


        System.out.println("---------- LinkedHashMap ----------");
        //linkedhashmap and linkedhashset are used for cache implementation, no duplicates
        //uses hashtable and linked list
        //insertion order is preserved.

        //duplicates are not allowed

        System.out.println("---------- SortedMap ----------");


        System.out.println("---------- TreeMap ----------");

        //Black-Red Tree
        //duplicate keys are not allowed values yes, insertion order is not preserved
        //homogenous keys: natural sorting order
        //heterogeneous keys : comparator



        System.out.println("---------- HashTable ----------");

        //uses hashtable, dupicates keys not allowed, insertion order not preserved
        //sync method and thread safe
        //capacity is 11, fill ratio

        System.out.println("---------- Properties ----------"); //read properties file



        //Entry is an interface which is part of Map class
        //keyset, keyvalue, setvalue






    }
}

class Temp{
    @Override
    public String toString() {
        return "Temp";
    }
    public void finalizes(){
        System.out.println("finalize() called");
    }
}