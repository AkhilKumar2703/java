package LinkedList.CircularLL;

public class CLL {

    private Node head;
    private Node tail;

    public CLL(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.err.println(node.val + "->");
                node = node.next;
            } while (node != head);

        }

    }

    public void delete(int value) {
        Node node = head;
        if (node == null) {
            return;
        }
        if (node.val == value) {
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node n = new Node;
            if(n.val == value) {
                node.next = n.next;
                return;
            }
            node = node.next;
        }while(node !=head);

    }

    public class Node {
        int val;
        Node next;

        publiv Node(int val) {
            this.val = val;
        }
    }

}
