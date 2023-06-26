package DS.linkedList;

import DS.Node;

public class SinglyLinkedList {

    public Node insertAtBegin(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        while(temp.next!=null) {
            temp= temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public Node insertAtPosition(Node head, int data, int position) {
        Node newNode = new Node(data);
        if(position==0) {
            head = insertAtBegin(head,data);
            return head;
        }
        Node tempNode = head;
        int count=1;
        while(count < position-1 && tempNode.next!= null) {
            tempNode = tempNode.next;
            count ++;
        }
        newNode.next = tempNode.next;
        tempNode.next = newNode;
        return head;
    }

    public Node  deleteAtPosition(Node head, int position) {
        int counter = 1;
        Node current= head;
        Node prev = null;
        if(position==1) {
            head = head.next;
            return head;
        } else {
            while(counter< position&& current.next!=null) {
                prev = current;
                current = current.next;
                counter++;
            }
            if(current.next !=null) {
                prev.next = current.next;
            }else {
                System.out.println("Cannot delete Element since this position doesnt exists");
            }


        }
        return head;
    }

    public void printLL(Node head) {
        Node temp  = head;
        while (temp != null) {
            System.out.print(temp);
            temp = temp.next;
        }

    }
    public Node reverseLinkedList(Node head) {
        Node current = null;
        Node prev = null;
        Node next = null;
        current = head;

        while (current !=null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;

    }

    public boolean checkIfLLIsCircular(Node head) {
        Node traversed = head;
        if (traversed == null) {
            return true;
        }
        while(traversed != null && traversed !=head) {
            traversed = traversed.next;
        }
        return (head== traversed);
    }

    public Node  findTail(Node head) {
        Node tail = null;
        while(head.next!= null) {
            head = head.next;
        }
        tail = head;
        return  tail;
    }

    public Node reverseLinkedListRecursive(Node head, Node current, Node prev) {
       // Base case: termination case
        if(current == null) {
            head = prev;
            return head;

        }

     head = reverseLinkedListRecursive(head,current.next, current);
     current.next = prev;
     return  head;

    }
    public Node reverseLinkedListRecursive2(Node head) {
        // Base case: termination case
        Node current = head;
        if(current == null || current.next == null) {
            return current;
        }
        Node shortHead = reverseLinkedListRecursive2(head.next);
        // Hum log yaha par 1-2-3-null agar head 2 par hai , 2 k next ka next null ko wapas 2 assign kar rakhe hain
        // matlab 1-2-3->2, aur ab head ka null matlab 2 ka next 3 wala connection kar denge, kyo ki 3 ka reverse connection
        // 2 k sath ho gya hai
        head.next.next = head;
        head.next = null;
        return shortHead;
    }

    public Node middleOfLinkedList(Node head) {
        // Base case: termination case
        if(head== null || head.next == null || head.next.next == null) {
            return head;
        }
        Node fastPointer = head.next.next;
        Node slowPointer = head.next;

        while (fastPointer!=null && fastPointer.next!= null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        return slowPointer;
    }
/*
reverseTheLinkListWithKGroupNodes ka matlab
1-2-3-4-5-6-7 and k=2;

2 -2 k group me reverse karna hai, 1-2 == 2-1, 3-4= 4-3 .... so on

 */

    public Node reverseTheLinkListWithKGroupNodes(Node head, int k){
        //base case
        if(head == null) {
            return null;
        }
        // First K Group of nodes ko hum legacy method say karenge baki recusrrion sambhal lega
        Node next = null;
        Node current = head;
        Node current2 = head;
        Node prev = null;
        int counter = 0;
        int counter2 = 0;
        while(current2 !=null && counter2 < k){
            current2 = current2.next;
            counter2++;
        }
        if(counter2 < k ){
            return head;
        }
        while(current!=null && counter < k && counter2 == k){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            counter++;
        }
        if(next != null) {
            head.next = reverseTheLinkListWithKGroupNodes(next,k);
        }
        head = prev;
       return head;

    }
    public static void hello(){

    }
    public static void main(String[] args) {
        SinglyLinkedList ss = new SinglyLinkedList();
        Node head = new Node(1);
        for(int i = 2; i< 6;i ++) {
            head = ss.insertAtEnd(head, i);
        }

        ss.printLL(head);
        System.out.println("---------------------------------------");
//        head = ss.insertAtPosition(head,9999,13);
//        ss.printLL(head);




//        System.out.println("---------Recursivewith 3 args------------------------------");
//        head = ss.reverseLinkedListRecursive(head, head, null);
//        ss.printLL(head);
//        System.out.println("");

        System.out.println("---------Recursive with 2 group Nodes------------------------------");
        head = ss.reverseTheLinkListWithKGroupNodes(head,3);
        ss.printLL(head);


//        head = ss.middleOfLinkedList(head);
//        System.out.println("Middle:"+head);
//        Node tail = ss.findTail(head);
//        tail.next = head;
//        System.out.println("Is a Circular List::"+ss.checkIfLLIsCircular(tail));

//
//        head = ss.deleteAtPosition(head,1);
//        System.out.println("---------------After Del posi 1------------------------");
//        ss.printLL(head);
//        head = ss.deleteAtPosition(head,5);
//        System.out.println("---------------After Del posi 5------------------------");
//        ss.printLL(head);
//
//        System.out.println("REVERSELL");
//        head = ss.reverseLinkedList(head);
       // ss.printLL(head);
    }


}
