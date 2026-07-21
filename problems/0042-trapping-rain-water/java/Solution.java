class Solution {
    public int trap(int[] h) {
        int ans = 0, n = h.length;
        int[] maxr = new int[n];
        int[] maxl = new int[n];
        maxr[n-1] = h[n-1]; maxl[0] = h[0];
        for(int i = 1; i < n; i++){
            maxl[i] = Math.max(maxl[i-1], h[i]);
            maxr[n-i-1] = Math.max(maxr[n-i], h[n-i-1]);
        }
        for(int i = 0; i < n; i++) {
            ans += Math.min(maxl[i],maxr[i]) - h[i];
        }
        return ans;
    }
}