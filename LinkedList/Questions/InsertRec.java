package LinkedList.Questions;

public class InsertRec {
    public void insertRec(int val, int index) {
        head = Insert(val, index, head);
    }

    private node Insert(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;

        }

        node.next = Insert(val, index--, node.next);
        return node;
    }
}
