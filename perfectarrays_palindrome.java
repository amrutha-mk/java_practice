class Solution {
    public static boolean isPerfect(int n, int[] arr) {
        // code here
        for(int i=0; i<n/2; i++){
            if(arr[i]!=arr[n-1-i]){
                return false;
            }
        }
            return true;
        }
    }
