public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = 0, sizeB = 0;
        ListNode a = headA; ListNode b = headB;
        while(a != null){
            a = a.next;
            sizeA++;
        }
        while(b != null){
            b = b.next;
            sizeB++;
        }
        a = headA; b = headB;
        if(sizeA > sizeB){
            int d = sizeA-sizeB;
            for(int i = 0; i < d; i++) a = a.next;
        }
        else{
            int d = sizeB-sizeA;
            for(int i = 0; i < d; i++) b = b.next;
        }
        while(a != null && b != null){
            if(a == b) return a;
            a = a.next;
            b = b.next;
        }
        return null;
    }
}