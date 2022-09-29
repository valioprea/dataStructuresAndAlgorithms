package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // *****************************************************

        // LinkedList =  Nodes are in 2 parts (data + address)
        //                        Nodes are in non-consecutive memory locations
        //                        Elements are linked using pointers
        //Each node contains: data and address(pointer) of the next node.

        //Singly Linked List
        // Node Node Node
        //[data, address ] -> [data, address ] -> [data, address ]

        //Doubly Linked List
        // Node Node
        //[address, data, address ] <-> [address, data, address ]


        //    advantages?
        //    1. Dynamic Data Structure (allocates needed memory while running)
        //    2. Insertion and Deletion of Nodes is easy. O(1)
        //    3. No/Low memory waste

        //    disadvantages?
        //    1. Greater memory usage (additional pointer)
        //    2. No random access of elements (no index [i])
        //    3. Accessing/searching elements is more time consuming. O(n)

        //    uses?
        //    1. implement Stacks/Queues
        //    2. GPS navigation
        //    3. music playlist
        //

        // *****************************************************


        LinkedList<String> linkedList = new LinkedList<>();

//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.push("D");
//        linkedList.push("F");
//        linkedList.pop();

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        linkedList.add(4,"E");

        System.out.println(linkedList.indexOf("F"));
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("0");
        linkedList.addLast("G");

        //remove first & remove last

        System.out.println(linkedList);



    }
}