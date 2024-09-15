package collection.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.add("Zaur");
        queue.add("Andrii");
        queue.add("Oleg");
        queue.add("igor");
        queue.add("Ivan");
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());

        System.out.println(queue);
    }
}
