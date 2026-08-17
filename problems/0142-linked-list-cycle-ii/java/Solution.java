public class Solution {
    public ListNode detectCycle(ListNode head) {
        Map<ListNode, Integer> map = new HashMap<>();
        int idx = 0; ListNode temp = head;
        while(temp != null){
            if(map.containsKey(temp)) return temp;
            else map.put(temp, idx);
            temp = temp.next;
            idx++;
        }
        return null;
    }
}