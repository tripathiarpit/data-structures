package DS.linkedList;
/*
There is a singly-linked list head and we want to delete a node node in it.

You are given the node to be deleted node. You will not be given access to the first node of head.

All the values of the linked list are unique, and it is guaranteed that the given node node is not the last node in the linked list.

Delete the given node. Note that by deleting the node, we do not mean removing it from memory. We mean:

The value of the given node should not exist in the linked list.
The number of nodes in the linked list should decrease by one.
All the values before node should be in the same order.
All the values after node should be in the same order.
Input: head = [4,5,1,9], node = 5
Output: [4,1,9]
Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.
 */

import DS.Node;

import java.util.LinkedList;

public class DeleteGivenLLNode {
    public static void main(String[] args) {
        Node head = new Node(1);
        for (int i = 2; i < 10; i++) {
            head = LinkedListUtil.insertAtEnd(head, i);
        }
        System.out.println("Before");
        LinkedListUtil.printLL(head);
        Node target = LinkedListUtil.getNthNode(head, 5);
        deleteNode(target, head);
        System.out.println("After");
        LinkedListUtil.printLL(head);
    }

    public static void deleteNode(Node node, Node head) {
        node.data = node.next.data;
        node.next = node.next.next;
    }
}
