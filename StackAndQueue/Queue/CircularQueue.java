package StackAndQueue.Queue;

public class CircularQueue {
    protected int[] data;
    private static final int default_size = 10;
    int f = 0;
    int e = 0;
    int size = 0;

    public CircularQueue() {
        this(default_size);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // insert
    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[e++] = item;
        e = e % data.length;
        size++;

    }

    // remove
    public int remove() {
        if (isEmpty()) {
            throw new exception("Queue is empty");
        }
        int removed = data[f++];
        f = f % data.length;
        size--;

        return removed;
    }

    public void front() {
        if (isEmpty()) {
            throw new exception("Queue is empty");
        }
        return data[f];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("queue is empty");
        }
        int i = f;
        do {
            System.out.println(data[i] + "->");
            i++;
            i = i % data.length;
        } while (i != e);
        System.out.println("end");

    }
}