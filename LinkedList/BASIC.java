package LinkedList;

public class BASIC {
    private LL head;
    private LL tail;
    private int size;

    public BASIC() {
        this.size = 0;
    }

    public void display
    {
        LL temp = head;
        if (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("end");
    }

    // insert first
    public void insertValue(int val) {
        LL node = new LL(val);
        node.next = head;
        node = head;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    // insert last
    public void insertLast(int val) {
        if (tail == null) {
            insertValue(val);
        }
        LL node = new LL(val);
        tail.next = node;
        tail = node;
        s += 1;
    }

    // insert value in between
    public void insertMid(int val, int index) {
        if (index == 0) {
            insertValue(val);
        }
        if (index == size) {
            insertLast(val);
        }
        LL temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        LL node = new LL(val, temp.next);
        temp.next = node;
        size++;

    }

    // remove first value
    public LL deleteFirst
    {
        int value = head.val;
        head = head.next;
        if(head ==null){
            tail == null;
        }
        size --;
        return value;
    }

    // remove last
    public LL deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        LL secondLast = get(size - 2);
        int value = tail.val;
        tail = secondLast;
        tail.next = null;
        return value;

    }

    // delete anywhere
    public LL deleteAny(int index) {
        if (index == 0) {
            deleteFirst();
        }
        if (index == size - 1) {
            deleteLast();
        }
        LL prev = get(index - 1);
        int value = prev.next.val;
        prev.next = prev.next.next;
        return value;

    }

    // to find any value
    public node find(int value) {
        LL node = head;
        while (nde != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // this function provides the index value
    public node get(int index) {
        LL node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public class LL {
        public int val;
        public LL next;

        public LL(int val) {
            this.val = val;
        }

        private LL(int val, LL next) {
            this.next = next;
            this.val = val;
        }

    }
}
