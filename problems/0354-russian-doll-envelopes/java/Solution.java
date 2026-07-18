class Solution {
    public void bs(int i, int j, int target, List<Integer> ans){
        while(i < j){
            int mid = i + (j - i)/2;
            if(ans.get(mid) >= target) j = mid;
            else i = mid + 1;
        }
        ans.set(j, target);
    }
    public int maxEnvelopes(int[][] e) {
        Arrays.sort(e, (a,b) -> {
            if(a[0] == b[0]) return Integer.compare(b[1], a[1]); // in decreasing order
            return Integer.compare(a[0], b[0]);
        });
        int n = e.length;
        List<Integer> ans = new ArrayList<>();
        ans.add(e[0][1]);
        for(int i = 1; i < n; i++){
            if(ans.get(ans.size() - 1) < e[i][1]) ans.add(e[i][1]);
            else bs(0, ans.size()-1, e[i][1], ans);
        }
        return ans.size();
    }
}