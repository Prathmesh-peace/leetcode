class Solution {
    public int[] findErrorNums(int[] arr) {
        int[] a = new int[2];
        int n = arr.length , i = 0;
        while(i < n) {
            int ele = arr[i];
            if(arr[i] == i+1 || arr[i] == arr[ele - 1]) i++ ;
            else {
                int temp = arr[i];
                arr[i] = arr[ele - 1];
                arr[ele - 1] = temp ;
            }
        }
        for(i = 0 ; i < n ; i++) {
            if(arr[i] != i+1){
                a[0] = arr[i];
                a[1] = i+1;
            }
        }
        return a;
    }
}