class Solution {
    public Node deepCopy(Node head){
        Node temp = new Node(head.val);
        Node t1 = head.next; Node t2 = temp;
        while(t1 != null){
            Node t = new Node(t1.val);
            t2.next = t;
            t2 = t2.next;
            t1 = t1.next;
        }
        return temp;
    }
    public void connectAlternate(Node head, Node head2){
        Node dummy = new Node(-10);
        Node t = dummy; Node t1 = head; Node t2 = head2;
        while(t1 != null && t2 != null){
            t.next = t1;
            t = t.next;
            t1 = t1.next;
            t.next = t2;
            t = t.next;
            t2 = t2.next;
        }
    }
    public void assignRandom(Node head, Node head2){
        Node t1 = head; Node t2 = head2;
        while(t1 != null){
            t2 = t1.next;
            if(t1.random != null) t2.random = t1.random.next;
            t1 = t1.next.next;
            
        }
    }
    public void removeAlternate(Node head, Node head2){
        Node t1 = head; Node t2 = head2;
        while(t1 != null){
            t1.next = t2.next;
            t1 = t1.next;
            if(t1 == null) break;
            t2.next = t1.next;
            t2 = t2.next;
        }
    }
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        // step-1 : create a deep copy
        Node head2 = deepCopy(head);
        // step-2 : make alternate connections
        connectAlternate(head, head2);
        // step-3 : Assign Random Pointers
        assignRandom(head, head2);
        // step-4 : Remove alternate connections
        removeAlternate(head, head2);

        return head2;
    }
}