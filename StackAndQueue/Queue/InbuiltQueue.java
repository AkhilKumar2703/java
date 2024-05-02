package StackAndQueue.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class InbuiltQueue {
    public static void main(String[] args) {
        Queue<Integer> b = new LinkedList<>();
        b.add(1);
        b.add(78);
        b.add(11);
        b.add(36);
        System.out.println(b);
        System.out.println("--------------------------------------------------------");
        System.out.println("1 remove - " + b.remove());
        System.out.println("2 remove - " + b.remove());
        System.out.println("3 remove - " + b.remove());
        System.out.println("--------------------------------------------------------");
        System.out.println(b);

        // Queue<Integer> b = new Queue<E>() {

        // };

    }
}
