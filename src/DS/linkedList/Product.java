package DS.linkedList;

import java.util.LinkedList;

public class Product {
    public static void main(String[] args) {

        LinkListNode head = null;
        LinkedList2 linkedList2 = new LinkedList2();
        for (int i = 0; i <=5; i++) {
            head  = linkedList2.addNode(i,head);
        }
        System.out.println("Before Inserting into postion");
        linkedList2.traverseLinkedList(head);

//        head = linkedList2.reverseRec(head, head, null);
//        System.out.println("After Reverse");
//        linkedList2.traverseLinkedList(head);


//        head = linkedList2.reverseRec2(head);
//        System.out.println("After Reverse");
//        linkedList2.traverseLinkedList(head);


//        System.out.println("After Reverse");
//       head =  linkedList2.reverseInKGroup(head, 2);
//        linkedList2.traverseLinkedList(head);
        System.out.println("After Reverse");
        head =  linkedList2.swapPairs2(head);
        linkedList2.traverseLinkedList(head);
    }
}
