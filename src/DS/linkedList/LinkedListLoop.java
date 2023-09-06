package DS.linkedList;

import DS.Node;

import java.awt.*;
import java.util.Stack;

public class LinkedListLoop {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node linkToAnyExistingNode = null;
        for (int i = 2; i < 10; i++) {
            head = LinkedListUtil.insertAtEnd(head, i);
        }
        int i = 0;
        Node current = head;
        while (i <= 5) {
            current = current.next;
            i++;
        }
        Node tail = LinkedListUtil.returnTailOfLinkedList(head);
        tail.next = current;

        LinkedListLoop listLoop = new LinkedListLoop();
        System.out.println("Is linkedList Cyclic:" + listLoop.isLinkedListCyclic(head));
        System.out.println("After Breaking Cycle");
        listLoop.breakTheLinkedListCycle(head);
        LinkedListUtil.printLL(head);
    }

    private Node getTheIntersectionPoint(Node head) {
        Node current = head;
        Node slowPointer = current.next;
        Node fastPointer = current.next.next;
        while (current != null) {
            if (slowPointer == fastPointer) {
                return slowPointer;

            }
            current = current.next;
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        return null;
    }

    private Node getStartOfLoop(Node head, Node intersectionNode) {
        Node current = head;
        while (intersectionNode != current) {
            current = current.next;
            intersectionNode = intersectionNode.next;
        }
        return current;
    }

    public boolean isLinkedListCyclic(Node head) {
        if (head == null || head.next == null) {
            return false;
        }
        boolean isCyclic = false;
        Node current = head;
        Node slowPointer = current.next;
        Node fastPointer = current.next.next;
        while (current != null) {
            if (slowPointer == fastPointer) {
                return true;
            }
            current = current.next;
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return isCyclic;
    }

    public Node breakTheLinkedListCycle(Node head) {
        if (isLinkedListCyclic(head)) {
            Node intersectionPoint = getTheIntersectionPoint(head);
            Node startOfLoop = getStartOfLoop(head, intersectionPoint);
            Node temp = startOfLoop;
            while (temp.next != startOfLoop) {
                temp = temp.next;
            }
            temp.next = null;
        }
        return head;
    }
}