class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] brr = Arrays.copyOf(arr, n);
        Arrays.sort(arr);
        int rank = 1;
        Map<Integer, Integer> map = new HashMap<>();
        for(int ele : arr){
            if(!map.containsKey(ele)) map.put(ele, rank++);
        }
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            ans[i] = map.get(brr[i]);
        }
        return ans;
    }
}