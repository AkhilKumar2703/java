package StackAndQueue.Queue;

public class CustomQueue {
    protected int[] data;
    private static final int default_size = 10;
    int end = 0;

    public CustomQueue() {
        this(default_size);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end++] = item;
        // end++;
    }

    public int remove() {
        if (isEmpty()) {
            throw new exception("Queue is empty");
        }
        int removed = data[0];
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        return removed;
    }

    public void front() {
        if (isEmpty()) {
            throw new exception("Queue is empty");
        }
        return data[0];
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.println(data[i] + " ");
        }
        System.out.println("end");
    }
}