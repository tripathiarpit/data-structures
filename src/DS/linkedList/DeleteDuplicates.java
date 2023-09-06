package DS.linkedList;

import DS.Node;

import java.util.HashSet;

/*
Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
Return the linked list sorted as well.
Input: head = [1,1,2,3,3]
Output: [1,2,3]
 */
public class DeleteDuplicates {
    public static void main(String[] args) {
        Node head = new Node(1);
        LinkedListUtil.insertAtEnd(head, 1);
        LinkedListUtil.insertAtEnd(head, 2);
        LinkedListUtil.insertAtEnd(head, 3);
        LinkedListUtil.insertAtEnd(head, 3);
        System.out.println("Before Delete");
        LinkedListUtil.printLL(head);
        head = deleteDuplicates(head);
        System.out.println("After Delete");
        LinkedListUtil.printLL(head);
    }
    public static Node deleteDuplicates(Node head) {
        HashSet<Integer> nodeSet= new HashSet<>();
        Node current = head.next;
        Node prevRight = head;
        nodeSet.add(head.data);
        while(current != null) {
            if(!nodeSet.contains(current.data)) {
                nodeSet.add(current.data);
                prevRight.next = current;
                prevRight = current;
            } else {
                prevRight.next =null;
            }
            current = current.next;
        }
        return head;
    }
}
