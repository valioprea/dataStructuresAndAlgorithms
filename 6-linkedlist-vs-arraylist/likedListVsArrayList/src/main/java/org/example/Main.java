package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //In most situations, array list is better - more flexible for most apps

        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime;
        long endTime;
        long elapsedTime;

        for(int i = 0; i< 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        // **************** LinkedList ****************
        startTime = System.nanoTime();
        //do something

//        linkedList.get(0);
//        linkedList.get(500000);
//        linkedList.get(999999);
//        linkedList.remove(0); //here linked list will be better
//        linkedList.remove(500000);
        linkedList.remove(999999);

        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("linked list "+elapsedTime + " ns");

        // **************** ArrayList *****************
        startTime = System.nanoTime();
        //do something

//        arrayList.get(0); //here array list will be better
//        arrayList.get(500000); //here array list will be better
//        arrayList.get(999999); //here array list will be better
//        arrayList.remove(0);
//        arrayList.remove(500000); //here array list will be better
        arrayList.remove(999999); //here array list will be better

        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Array list "+elapsedTime + " ns");

    }
}