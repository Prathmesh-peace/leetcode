class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] f = new int[26];
        for(char c : tasks) f[c - 'A']++;
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : f) if(ele != 0) pq.add(ele);
        int count = 0;
        while(!pq.isEmpty()){
            List<Integer> l = new ArrayList<>();
            for(int i = 0; i < n+1; i++){
                if(!pq.isEmpty()){
                    int p = pq.remove();
                    l.add(--p);
                }
            }
            for(int ele : l) if(ele > 0) pq.add(ele);
            if(pq.isEmpty()) count += l.size();
            else count += n+1;
        }
        return count;
    }
}
