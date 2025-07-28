package DS.linkedList;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class SwapInPair<T> {
    public static void main(String[] args) {
        LinkListNode head = null;
        LinkedList2 linkedList2 = new LinkedList2();
        for (int i =1; i <=7; i++) {
            head  = linkedList2.addNode(new Integer(i),head);
        }
        System.out.println("Before Swap");
        linkedList2.traverseLinkedList(head);
        head = SwapInPair.revInPair(head);
        System.out.println("After Swap");
        linkedList2.traverseLinkedList(head);
    }
    public static LinkListNode swapInPair(LinkListNode head) {
        // N -> 1 2   3 4   5
        //  2 1   4 3  5- NULL
        if(head == null || head.next == null) {
            return  head;
        }
        LinkListNode newHead = new LinkListNode(null);
        newHead.next = head;
        LinkListNode current = newHead;

        while (current.next!= null && current.next.next!=null) {

            LinkListNode firstNode = current.next;
            LinkListNode secondNode = current.next.next;

            firstNode.next = secondNode.next;
            secondNode.next = firstNode;

            current.next = secondNode;
            current = firstNode;
        }
        return  newHead.next;
    }
// 1-->2-->3-->4
    public static LinkListNode revInPair(LinkListNode head) {

        if(head == null || head.next == null) {
            return head;
        }

            LinkListNode firstNode = head;
            LinkListNode secondNode = head.next;
            firstNode.next = revInPair(secondNode.next);
            secondNode.next = firstNode;
            return  secondNode;
    }

}
