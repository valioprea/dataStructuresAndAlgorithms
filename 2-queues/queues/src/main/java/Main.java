import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // *****************************************************

        // Queue = FIFO data structure. First-In First-Out
        //		   A collection designed for holding elements prior to processing
        //		   Linear data structure

        //         enqueue = offer() -> add obj to end of queue
        //         dequeue = poll()  -> remove obj from front of queue

        // Where are queues useful?

        // 1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
        // 2. Printer Queue (Print jobs should be completed in order)
        // 3. Used in LinkedLists, PriorityQueues, Breadth-first search

        // *****************************************************

        Queue<String> queue = new LinkedList<String>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);

        //these methods are inherited from queue class from container
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Harold")); //does not return the index

    }
}
