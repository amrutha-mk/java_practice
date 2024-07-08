class Solution {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Your code here
       ArrayList<Integer> numbers= new ArrayList<Integer>();
       int max=arr[n-1];
       numbers.add(max);
       for(int i=n-2;i>=0;i--){
           if(arr[i]>=max){
               numbers.add(arr[i]);
               max=arr[i];
           }
       }
       Collections.reverse(numbers);
       return numbers;
    }
}