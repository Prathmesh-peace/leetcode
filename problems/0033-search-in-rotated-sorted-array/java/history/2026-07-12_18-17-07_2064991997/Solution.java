class Solution {
    public int bs(int[] arr , int i , int j , int x){
        while(i <= j) {
            int mid = (j-i)/2 + i ;
            if(arr[mid] == x) {
                return mid ;
            }
            else if (arr[mid] > x) j = mid - 1 ;
            else i = mid + 1 ;
        }
        return -1 ;
    }
    public int search(int[] arr, int x) {
        int n = arr.length , i = 1 , j = n-2 , pivot = -1 ;
        if(n <= 2) {
            for(int k = 0 ; k < n ; k++) {
                if(arr[k] == x) return k ;
            }
            return -1 ;
        }
        while(i <= j) {
            int m = (j-i)/2 + i ;
            if(arr[m] > arr[m-1] && arr[m] > arr[m+1]) {
                pivot = m ;
                break ;
            }
            else if(arr[m] < arr[m-1] && arr[m] < arr[m+1]) {
                pivot = m - 1 ;
                break ;
            }
            else if(arr[m] > arr[m-1] && arr[m] < arr[m+1]){
                if(arr[m] > arr[n-1]) i = m + 1 ;
                else j = m - 1 ;
            }
        }
        if(pivot == -1) {
            return bs(arr , 0 , n-1 , x);
        }
        int left = bs(arr , 0 , pivot , x);
        if(left != -1) return left ;
        int right = bs(arr , pivot+1 , n-1 , x);
        return right ;
    }
}