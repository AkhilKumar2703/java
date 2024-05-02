package StackAndQueue.Stacks;

public class CustomStack {
    protected int[] data;
    private static final int default_stack_size = 10;
    int ptr = -1;

    public CustomStack() {
        this(default_stack_size);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    // push
    public boolean push(int item) {
        if (isFull()) {
            throw new exception("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    // pop
    public int pop(int item) {
        if (isEmpty()) {
            throw new exception("Stack is empty");
        }
        return data[ptr--];
    }

    // peek
    public int peek() {
        return data[ptr];

    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

}
