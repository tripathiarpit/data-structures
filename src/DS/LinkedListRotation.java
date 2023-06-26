package DS;

public class LinkedListRotation {
    Node head;
    public void printList(Node head) {
        Node node=  head;
        while(node!=null) {
            System.out.print(node.data+"->");
            if(node.next == null) {
                System.out.print("null");
            }
            node = node.next;
        }

    }
    public  void insert(Node n) {
        Node node=  head;
        if(this.head == null) {
            this.head = new Node(n.data);
            this.head.next = null;
            return;
        }
        n.next = null;
        while(node.next!=null) {
            node = node.next;
        }
        node.next = n;
    }
    public void rotateLinkedList(Node head) {
      Node current = head;
      Node next,prev = null;
      while(current != null) {
          next  = current.next;
          current.next = prev;
          prev = current;
          current = next;
      }
      this.head = prev;
    }

    public static void main(String[] args) {
        LinkedListRotation linkedListRotation = new LinkedListRotation();
        for(int i = 0; i< 10;i ++) {
            Node n = new Node(i*4);
            linkedListRotation.insert(n);
        }
        System.out.println("Before Rotation");
        linkedListRotation.printList(linkedListRotation.head);
        linkedListRotation.rotateLinkedList(linkedListRotation.head);
        System.out.println("");
        System.out.println("After Rotation");
        linkedListRotation.printList(linkedListRotation.head);

    }
}
