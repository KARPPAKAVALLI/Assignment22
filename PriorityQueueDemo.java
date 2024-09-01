package com.assignment22;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    //Write a Java program that creates a `PriorityQueue` of integers.
    //Add the numbers 5, 1, 3, 2, and 4 to the queue.
    //Print the head of the queue using the `peek` method, then remove the head and print the entire queue to show the new order.
    public static void main(String[] args) {
        PriorityQueue<Integer> values=new PriorityQueue<>();
        values.add(5);
        values.add(1);
        values.add(3);
        values.add(2);
        values.add(4);

        System.out.println("Head of the Queue: "+values.peek());
        values.poll();
        System.out.println("Queue after head removal: "+values);
    }
}
