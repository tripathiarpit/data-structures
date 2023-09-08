package DS.linkedList;

import DS.Node;

/*
You are given the head of a singly linked-list. The list can be represented as:

L0 → L1 → … → Ln - 1 → Ln
Reorder the list to be on the following form:

L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
You may not modify the values in the list's nodes. Only nodes themselves may be changed.
Input: head = [1,2,3,4]
Output: [1,4,2,3]
 */
public class RedorderLinkList {


    public static void main(String[] args) {
        SinglyLinkedList ss = new SinglyLinkedList();
        Node head = new Node(1);
        for(int i = 2; i< 4;i ++) {
            head = ss.insertAtEnd(head, i);
        }
        System.out.println("Before");
        ss.printLL(head);
        System.out.println("");
        System.out.println("After");
        RedorderLinkList redorderLinkList = new RedorderLinkList();
        redorderLinkList.reorderList(head);
        ss.printLL(head);
    }
    public void reorderList(Node head) {
        Node fastPointer = head;;
        Node slowPointer = head;
        Node twoHead = null;
        while (fastPointer !=null && fastPointer.next != null ) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        twoHead = slowPointer.next;
        slowPointer.next = null;
        Node twoLLHead = reverseLL(twoHead);
        Node oneLLHead = head;

        Node left = oneLLHead;
        Node right = twoLLHead;
        while (right !=null) {
            Node nextLeft = left.next;
            Node nextRight = right.next;
            left.next = right;
            right.next = nextLeft;
            left = nextLeft;
            right = nextRight;
        }



    }

    private Node reverseLL(Node node) {
        if(node == null || node.next == null) {
            return node;
        }
        Node left = reverseLL(node.next);
        node.next.next = node;
        node.next = null;
        return left;
    }
}
