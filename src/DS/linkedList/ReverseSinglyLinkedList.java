package DS.linkedList;

import DS.Node;

public class ReverseSinglyLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        for(int i = 2; i< 6;i ++) {
           head = LinkedListUtil.insertAtEnd(head, i);
        }
        System.out.println("LinkedList before Reverse");
        LinkedListUtil.printLL(head);
        head = reverse(head,head, null);
        System.out.println("LinkedList After Reverse");
        LinkedListUtil.printLL(head);
//        System.out.println("LinkedList After 2nd Reverse");
//        head = reverse2(head);
//        LinkedListUtil.printLL(head);
    }

    public static Node reverse(Node head, Node current, Node prev) {
        if(current == null){
            return prev;
        }
        head = reverse(head,current.next, current);
        current.next = prev;
        return head;
    }

    public static Node reverse2(Node head) {
        Node current  = head;
        // base case
        if(current == null || current.next == null) {
            return  current;
        }
        Node remainingNode = reverse2(head.next);
        current.next.next = current;
        current.next = null;
        return remainingNode;
    }

}
