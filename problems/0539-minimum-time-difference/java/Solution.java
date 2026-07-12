class Solution {
    public int findMinDifference(List<String> tp) {
        int n = tp.size();
        int[][] time = new int[n][2];
        for(int i = 0; i < n; i++){
            String[] t = tp.get(i).split(":");
            int h = Integer.parseInt(t[0]), m = Integer.parseInt(t[1]);
            time[i][0] = h;
            time[i][1] = m;
        }
        Arrays.sort(time, (a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        });
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < time.length; i++){
            int m1 = time[i][0] * 60 + time[i][1];
            int m2 = time[i-1][0] * 60 + time[i-1][1];
            min = Math.min(min, m1-m2);
        }
        int first = time[0][0] * 60 + time[0][1];
        int last = time[n - 1][0] * 60 + time[n - 1][1];
        min = Math.min(min, 1440 - last + first);
        return min;
    }
}