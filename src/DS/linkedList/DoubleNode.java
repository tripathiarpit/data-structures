package DS.linkedList;

public class DoubleNode {
    int data;
    DoubleNode next;
    DoubleNode prev;

    DoubleNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    @Override
    public String toString() {
        return this.data+" ->";
    }
}
