package org.example;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //Priority Queue = A FIFO data structure that serves elements
        //                with the highest priorities first
        //				  before elements with lower priority

        //ASC order
//        Queue<Double> queue = new PriorityQueue<>();
//        queue.offer(3.0);
//        queue.offer(2.5);
//        queue.offer(4.0);
//        queue.offer(1.5);
//        queue.offer(2.0);
//        while ( !queue.isEmpty() ){
//            System.out.println(queue.poll());
//        }

        //DESC order
//        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
//        queue.offer(3.0);
//        queue.offer(2.5);
//        queue.offer(4.0);
//        queue.offer(1.5);
//        queue.offer(2.0);
//        while ( !queue.isEmpty() ){
//            System.out.println(queue.poll());
//        }

        //
        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");
        while ( !queue.isEmpty() ){
            System.out.println(queue.poll());
        }

    }
}