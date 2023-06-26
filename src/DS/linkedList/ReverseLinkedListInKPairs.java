package DS.linkedList;

import DS.Node;

public class ReverseLinkedListInKPairs {
    public static void main(String[] args) {
        Node head = new Node(1);
        for(int i = 2; i< 6;i ++) {
            head = LinkedListUtil.insertAtEnd(head, i);
        }
        System.out.println("LinkedList before Reverse");
        LinkedListUtil.printLL(head);
        System.out.println("LinkedList After Reverse in K pairs");
        head  = reverseInKPairs(head,2);
        LinkedListUtil.printLL(head);
//        System.out.println("LinkedList After Reverse in K pairs");
//        head  = reverseInKPairs2(head,3);
//        LinkedListUtil.printLL(head);
    }

    public static Node reverseInKPairs(Node head, int numOfPairs) {
        Node current = head;
       // base case
        if(current == null) {
            return  null;
        }
        int counter = 0;
        Node prev = null;
       while (current!=null && counter < numOfPairs) {
           Node next = current.next;
           current.next = prev;
           prev = current;
           current = next;
           counter ++;
       }
       if(current != null) {
           head.next = reverseInKPairs(current, numOfPairs);
       }
       head = prev;
       return head;
    }
/*
Variation hai ki , Link List ko K pair me reverse karo, agar POORE K pair nhi ban rahe hain to wo part ko as it is rehne do

Example 1-2-3-4-5-    K=3, o/p = 3-2-1-4-5 ,   ye 3-2-1-5-4 ye wrong ho jata becz Link list le length 5 hai aur isme 3 ka 1 hi par banega
 */
    public static Node reverseInKPairs2(Node head, int numOfPairs) {
        // base case
        if(head == null) {
            return  null;
        }
        int counter = 0;
        int counter2 = 0;
        Node current = head;
        Node current2 = head;
        Node prev = null;
        /*
        Ek function likhee hai jisse na bachi hui LinkList ki length, nikal jayegi agar bachi hui !=3 hai means
        ki 3ka pair ban nhi sakta to hum usko reverse nhi karenge as it is return kar denge
         */

        while(current2 != null && counter2 < numOfPairs) {
            current2 = current2.next;
            counter2++;
        }
        if(counter2 < numOfPairs){
            return head;
        }

        while (current!=null && counter < numOfPairs) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            counter ++;
        }
        if(current != null) {
            head.next = reverseInKPairs(current, numOfPairs);
        }
        head = prev;
        return head;
    }
}
