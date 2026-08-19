public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode slow = head; ListNode fast = head; ListNode t = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) break;
        }
        if(slow != fast) return null;
        while(t != slow) {
            slow = slow.next;
            t = t.next;
        }
        return t; 
    }
}