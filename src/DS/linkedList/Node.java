package DS;

public class Node {
    public int data;
    public Node next;
   public Node(int data) {
        this.data = data;
        next = null;
    }
public Node setNext(Node next) {
       this.next = next;
       return this;
}
    @Override
    public String toString() {
        return
                 data+"->"
                ;
    }
}
