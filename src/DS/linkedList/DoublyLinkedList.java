package DS.linkedList;

public class DoublyLinkedList {
    public DoubleNode insertAtEnd(int data, DoubleNode head){
        DoubleNode node = new DoubleNode(data);
        DoubleNode temp = head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next= node;
        node.prev = temp;
        return head;
    }
    public DoubleNode insertAtPosition(int data,int pos, DoubleNode head){
        DoubleNode node = new DoubleNode(data);
        DoubleNode temp = head;
        int counter =0;
        if(pos==0) {
            insertAtHead(data, head);
        } else {
            while (temp.next!=null && counter<pos){
                temp=temp.next;
                counter++;
            }
            temp.next= node;
            node.prev = temp;
        }


        return head;
    }
    public DoubleNode insertAtHead(int data, DoubleNode head){
        DoubleNode newNode = new DoubleNode(data);
        if(head == null) {
            head = newNode;
            return head;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        return head;
    }

    public DoubleNode deleteAtPosition(DoubleNode head, int position)
    {
        DoubleNode temp = head;
        if(position ==0)
        {
            temp.next.prev = null;
            head = temp.next;
            temp.next  =null;

        } else {
            int counter = 0;
            while(counter<position-1) {
                temp = temp.next;
                counter ++;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        return head;
    }
    public void printLinkList(DoubleNode head){
        while (head!=null){
            System.out.println(head);
            head =head.next;
        }
    }





    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        DoubleNode head = new DoubleNode(0);
        for(int i = 1; i< 10;i ++) {
            head = doublyLinkedList.insertAtEnd(i,head);
        }
        System.out.println("After Insert At end");
        doublyLinkedList.printLinkList(head);

        System.out.println("After Insert At Head");
        for(int i = 1; i< 10;i ++) {
            head = doublyLinkedList.insertAtHead(i*100,head);
        }
        doublyLinkedList.printLinkList(head);

        head = doublyLinkedList.deleteAtPosition(head,0);
        System.out.println("After Delete at 4");
        doublyLinkedList.printLinkList(head);
    }
}
