class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for(int i = 0; i < arr.length; i++){
            int remain = target - arr[i];
            if(map.containsKey(remain)){
                ans[0] = map.get(remain); ans[1] = i;
                break;
            }
            else map.put(arr[i], i);
        }
        return ans;
    }
}