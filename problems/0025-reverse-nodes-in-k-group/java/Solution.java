class Solution {
    public ListNode reverse(ListNode head){
        ListNode p = null; ListNode c = head; ListNode n = head;
        while(c != null){
            n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        return p;
    }
    public ListNode getNode(ListNode temp, int k){
        ListNode t = temp;
        for(int i = 0; i < k-1; i++){
            if(t == null) return null;
            t = t.next;
        }
        return t;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        for(int i = 0; i < k-1; i++) temp = temp.next;
        ListNode n = temp.next;
        ListNode p = head;
        temp.next = null;
        ListNode newHead = reverse(head);
        if(n == null) return newHead;
        temp = n;
        while(temp != null){
            ListNode kthNode = getNode(temp, k);
            if(kthNode == null) {
                p.next = n;
                return newHead;
            }
            n = kthNode.next;
            kthNode.next = null;
            ListNode rev = reverse(temp);
            p.next = rev;
            temp.next = n;
            p = temp;
            temp = temp.next;
        }
        return newHead;
    }
}