class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {

        // Your Code Here
        int totalsum=n*(n+1)/2;
        int arraysum=0;
        for(int i : arr){
            arraysum+=i;
        }
        return totalsum - arraysum;
    }
}
