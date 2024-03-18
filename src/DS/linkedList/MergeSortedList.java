package DS.linkedList;

import DS.Node;

public class MergeSortedList {

    public static void main(String[] args) {
        SinglyLinkedList ss = new SinglyLinkedList();
        SinglyLinkedList ss1 = new SinglyLinkedList();
        Node head = new Node(1);
        for(int i = 2; i< 4;i ++) {
            head = ss.insertAtEnd(head, i);
        }
        Node lsit1 = new Node(1).setNext(new Node(2).setNext(new Node(3).setNext(new Node(4))));
        //ss.printLL(lsit1);
        Node lsit2 = new Node(2).setNext(new Node(3).setNext(new Node(4).setNext(new Node(5))));
        Node n = MergeSortedList.mergeTwoLists(lsit1,lsit2);
        ss.printLL(n);

    }

    public static Node mergeTwoLists(Node l1, Node l2) {
        if(l1 == null)
        {
            return l2;
        }

        // if list2 happen to be null
        // we will simply return list1.
        if(l2 == null)
        {
            return l1;
        }

        // if dataue pointend by l1 pointer is less than equal to dataue pointed by l2 pointer
        // we wall call recursively l1 .next and whole l2 list.
        if(l1 .data <= l2 .data)
        {
            l1 .next = mergeTwoLists(l1 .next, l2);
            return l1;
        }
        // we will call recursive l1 whole list and l2 .next
        else
        {
            l2 .next = mergeTwoLists(l1, l2 .next);
            return l2;
        }

    }

}