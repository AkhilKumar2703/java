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

    public void insertValue(int val) {
        LL node = new LL(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
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
