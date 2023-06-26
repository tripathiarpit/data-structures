package DS.linkedList;

import DS.Node;

public class LinkedListUtil {
    public static Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        while(temp.next!=null) {
            temp= temp.next;
        }
        temp.next = newNode;
        return head;
    }
    public static void printLL(Node head) {
        Node temp  = head;
        while (temp != null) {
            System.out.print(temp);
            temp = temp.next;
        }
        if(temp== null){

        }
        System.out.print("NULL");
        System.out.println("");
    }

    public static Node returnTailOfLinkedList(Node head) {
        while(head.next != null) {
            head = head.next;
        }
        return head;
    }

}
