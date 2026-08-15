class Solution {
    public ListNode middleNode(ListNode head) {
        int n = 0;
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
            n++;
        }
        int mid = n/2;
        for(int i = 0; i < mid; i++) head = head.next;
        return (n % 2 == 0) ? head : head.next;
    }
}