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

public class perfectarrays_palindrome {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3, 2, 1};
        int arr2[] = {1, 2, 3, 4, 5, 1, 2};

        Solution obj = new Solution();

        boolean res1 = obj.isPerfect(arr.length, arr);
        boolean res2 = obj.isPerfect(arr2.length, arr2);
        
        if(res1 == true){
            System.out.println("Array one is palindrome");
        } else {
            System.out.println("Arraya one is not palindrome");
        }

        if(res2 == true){
            System.out.println("Array two is palindrome");
        } else {
            System.out.println("Arraya two is not palindrome");
        }
    }
}
