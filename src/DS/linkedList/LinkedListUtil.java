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

    public static Node getNthNode(Node head, int N){
        int count = 0;
        Node targetNode = head;
        if(getLength(head) > N) {
            while(count < N-1) {
                targetNode = targetNode.next;
                count++;
            }
        } else{
            return  null;
        }

        return targetNode;
    }
    public static int getLength(Node head){
        int count =1;
        Node targetNode = head;
        while(targetNode.next != null) {
            targetNode = targetNode.next;
            count++;
        }
        return count;
    }
}
