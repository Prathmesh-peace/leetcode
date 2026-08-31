class Solution {
    public class Pair implements Comparable<Pair>{
        int n, f;
        Pair(int n, int f){
            this.n = n;
            this.f = f;
        }
        public int compareTo(Pair p){
            return this.f - p.f;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        Queue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[] ans = new int[k];
        
        for(int ele : nums){
            if(map.containsKey(ele)) map.put(ele, map.get(ele)+1);
            else map.put(ele, 1);
        }
        for(int key : map.keySet()) pq.add(new Pair(key, map.get(key)));
        for(int i = 0; i < k; i++){
            Pair p = pq.remove();
            ans[i] = p.n;
        }
        return ans;
    }
}