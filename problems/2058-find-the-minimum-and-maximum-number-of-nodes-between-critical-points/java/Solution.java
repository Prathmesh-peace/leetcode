class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode p = head; ListNode c = head.next; ListNode n = head.next.next;
        int first = -1 , last = -1 , idx = 1, mindis = Integer.MAX_VALUE;
        int[] arr = {-1,-1};
        while(n != null) {
            if((p.val < c.val && c.val > n.val) || (p.val > c.val && c.val < n.val)) {
                if(first == -1) first = idx;
                if(last != -1) {
                    int dis = idx - last;
                    mindis = Math.min(mindis,dis);
                }
                last = idx;
            }
            idx++;
            p = p.next ; c = c.next ; n = n.next;
        }
        if(first == last) return arr;
        int maxdis = last - first;
        arr[0] = mindis ; arr[1] = maxdis;
        return arr;
    }
}