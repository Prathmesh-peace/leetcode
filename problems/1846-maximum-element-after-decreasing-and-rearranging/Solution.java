class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        if(arr.length == 1) return arr[0];
        Arrays.sort(arr);
        int max = 0; arr[0] = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] - arr[i-1] > 1) arr[i] = arr[i-1] + 1;
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}