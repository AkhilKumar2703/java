class MyQueue {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public MyQueue() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
        first.push(x);
    }

    public int pop() {
        while (!first.empty()) {
            second.push(first.pop());
        }
        int removed = second.pop();
        while (!second.empty()) {
            first.push(second.pop());
        }
        return removed;
    }

    public int peek() {
        while (!first.empty()) {
            second.push(first.pop());
        }
        int peeked = second.peek();
        while (!second.empty()) {
            first.push(second.pop());
        }
        return peeked;

    }

    public boolean empty() {
        return first.empty();
    }
}