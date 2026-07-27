class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int k = 2;
        for(int ele : nums){
            pq.add(ele);
            if(pq.size() > k) pq.remove();
        }
        int x = pq.remove() - 1;
        int y = pq.remove() - 1;
        return x*y;
    }
}