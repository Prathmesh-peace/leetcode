class Solution {
    public int minimumPushes(String s) {
        int[] arr = new int[26];
        for(int i = 0; i < s.length(); i++) arr[s.charAt(i) - 'a']++;
        Arrays.sort(arr);
        int ans = 0, n = 0, i = 25;
        while(i >= 0 && arr[i] != 0){
            if(n < 8) ans += arr[i];
            else if(n < 16) ans += 2*arr[i];
            else if(n < 24) ans += 3*arr[i];
            else ans += 4*arr[i];
            n++;
            i--;
        }
        return ans;
    }
}