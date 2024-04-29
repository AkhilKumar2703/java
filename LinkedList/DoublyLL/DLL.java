package LinkedList.DoublyLL;

import org.w3c.dom.Node;

import LinkedList.SingleLL.BASIC.LL;

public class DLL {

    Node head;

    // insert at first
    public void insertFirst() {
        Node node = new Node;
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head = node;
    }

    // to insert value at last
    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;
        node.last = null;
        if (head == null) {
            node.prev = null;
            head = node;
            return;

        }
        while (last.next != null) {
            last = last.next;

        }
        last.next = node;
        node.prev = last;
    }

    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.val + "->");
            last = node;
            node = node.next;
        }
        System.out.println("end");
        System.out.println("Print in reverse");

        while (last != null) {
            System.out.print(last.val + "->");
            last = last.prev;
        }
        System.out.println("start");

        System.out.println();
    }

    // to find any value
    public node find(int value) {
        Node node = head;
        while (nde != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    private class Node {
        int val;
        Node next;
        Node prev;

       public class(int val) {
            this.val = val;
        }
        public  class(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

    }
}
