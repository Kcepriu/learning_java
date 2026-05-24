package com.codewithmosh.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    static void main() {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("c");
        queue.add("a");
        queue.add("b");
        // b -> a -> c
        queue.offer("d");
        // d -> b -> a -> c

        System.out.println(queue);

        var front = queue.peek();//c
        System.out.println(front);
        System.out.println(queue);

        front = queue.remove();//c
        System.out.println(front);
        System.out.println(queue);

        front = queue.poll(); //a
        System.out.println(front);
        System.out.println(queue);







    }
}
