class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode p = null;
        ListNode c = head;
        ListNode n = head;
        while(c != null){
            n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        return p;
    }
}