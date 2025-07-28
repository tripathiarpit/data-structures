package DS.linkedList;



public class LinkedList2 {
    LinkListNode head;
    public  LinkListNode addNode(int data, LinkListNode head) {
        if (this.head == null) {
            this.head = new LinkListNode(data);
        } else if(this.head.next == null){
            LinkListNode newNode =   new LinkListNode(data);
            head.next = newNode;
        } else {
            LinkListNode lastNonNullNode = this.head;
            LinkListNode current = this.head;
            while(current.next!=null) {
                current = current.next;
            }
            lastNonNullNode = current;
            LinkListNode newNode =   new LinkListNode(data);
            lastNonNullNode.next = newNode;
            }
        return this.head;
    }
    public  LinkListNode addNode(int data , int position, LinkListNode head) {
        if (this.head == null) {
            this.head = new LinkListNode(data);
            return head;
        }
        if(position == 0 ) {
            LinkListNode newNode = new LinkListNode(data);
            newNode.next = head;
            return  newNode;
        } else {
            LinkListNode current = head;
            int positionCounter = 0;
            while(positionCounter < position-1 && current!=null) {
                positionCounter++;
                current = current.next;
            }
            LinkListNode newNode = new LinkListNode(data);
            newNode.next = current.next;
            current.next = newNode;
        }
        return this.head;
    }
    public void deleteNode(int data) {

    }
    public void deleteNode(LinkListNode node, int position) {

    }
    public LinkListNode getNode(int position) {
        return null;
    }

    public void traverseLinkedList(LinkListNode head) {
        LinkListNode current   = head;
        while(current != null) {
            System.out.print(current.data+"->");
            current = current.next;
        }
    }
    public LinkListNode reverse(LinkListNode head) {
        // 0->1->2->3->4->
        // NULL<-1<-2<-3<-4

        LinkListNode current  = head;
        LinkListNode prev = null;
        LinkListNode next = null;

        while(current!=null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

    }
        return prev;
    }
    public LinkListNode reverseRec(LinkListNode head, LinkListNode current, LinkListNode prev) {
        if(current == null){
            return prev;
        }
        //0-1-2
        head = reverseRec(head, current.next, current);
        current.next = prev;
        return head;
    }

    public LinkListNode reverseRec2(LinkListNode head){
        LinkListNode current = head;
        if(current == null || current.next == null) {
            return current;
        }
        // //0-1-2
        LinkListNode last = reverseRec2(current.next);
        current.next.next = current;
        current.next = null;
        return  last;
    }

    public LinkListNode reverseInKGroup(LinkListNode head, int k) {
        LinkListNode current = head;

        int counter = 0;
        LinkListNode next = null;
        LinkListNode prev = null;
        while(current!= null && counter< k) {
           prev = current;
           current = current.next;
           next = current;
           counter++;
        }
        if (counter==k) {
            prev.next = null;
           reverse(head);
            if(next!= null){
               head.next =  reverseInKGroup(next, k);
            }
        } else {
            return  head;
        }
        return  prev;
    }


    public LinkListNode swapPairs(LinkListNode head) {

        LinkListNode current = head;
        LinkListNode next = null;
        LinkListNode prev = null;
        int counter = 0;
        while(counter<2 && current!=null){
            next = current.next;
            prev = current;
            current = next;
            counter++;
        }
        if(counter<1) {
            return  head;
        }
        prev.next = null;
        LinkListNode temp = swapNodes(head);
        if(next!=null){
            head.next = swapPairs(next);
        } else {
            return temp;
        }
        return prev;
    }

    public LinkListNode swapNodes(LinkListNode head) {
        LinkListNode current = head;
        if(current == null || current.next == null) {
            return current;
        }
        LinkListNode newHead = swapNodes(current.next);
        current.next.next = current;
        current.next = null;
        return newHead;
    }
    public LinkListNode swapPairs2(LinkListNode head) {

        if(head== null || head.next ==null) {
            return head;
        }
        LinkListNode newNode = new LinkListNode(0);
        return null;
    }
    public LinkListNode swap(LinkListNode head) {
         if (head == null) {
             return  null;
         }
        LinkListNode  temp = head.next;
        head.next = swap(temp.next);
        temp.next = head;
        return null;

    }

}
