package StackAndQueue.Queue;

public class DynamicQueue extends CircularQueue {
    public DynamicQueue() {
        super();

    }

    public DynamicQueue(int size) {
        super(size);

    }

    @Override
    public boolean insert(int item) {
        if (this.isFull()) {
            // double array size
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(f + i) % data.length];
            }
            f = 0;
            e = data.length;
            data = temp;
        }
        return super.insert(item);
    }
}
