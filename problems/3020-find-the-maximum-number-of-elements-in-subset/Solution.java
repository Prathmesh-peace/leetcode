class Solution {
    public int maximumLength(int[] nums) {
        Map<Long, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put((long) num, freq.getOrDefault((long) num, 0) + 1);
        }
        int ans = 1;
        if (freq.containsKey(1L)) {
            int cnt = freq.get(1L);
            ans = Math.max(ans, (cnt % 2 == 0) ? cnt - 1 : cnt);
        }
        for (long start : freq.keySet()) {
            if (start == 1) continue;
            long x = start;
            int len = 0;
            while (freq.getOrDefault(x, 0) >= 2) {
                len += 2;
                if (x > (long) 1e9 / x) {
                    x = Long.MAX_VALUE;
                    break;
                }
                x *= x;
            }
            if (freq.getOrDefault(x, 0) >= 1) {
                len++;
            } else {
                len--;
            }
            ans = Math.max(ans, len);
        }
        return ans;
    }
}