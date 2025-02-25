package java_practice_programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ArrayListPrac {
    public static void main(String[] args) {
        ArrayList klist= new ArrayList<>();
        klist.add("hello");
        klist.add(23);
        klist.add("ajay");
        klist.add("jass");
        System.out.println(klist.size());
        System.out.println(klist);
        System.out.println(klist.get(1));
       // System.out.println(klist.remove(0));
        klist.add(1,"hellooo");
        System.out.println("after inserting helloom in index 1"+ klist);
        klist.set(1,"i am kabil");
        Iterator loop = klist.iterator();
        while (loop.hasNext()){
            System.out.println(loop.next());
        }
        klist.set(1,"i am kabil");
        for (Object x :klist){
            System.out.println(x);
        }
        HashMap<Integer,String> hash = new HashMap<>();
        hash.put(0,"kabil");
        hash.put(1,"ajay");
        System.out.println(hash);
        System.out.println(hash.keySet());
        for (Object z:hash.keySet()){
            System.out.println(z+" "+hash.get(z));
        }
    }

}

