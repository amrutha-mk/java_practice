class Solution {
    public static int gcd(int a, int b) {
        // code here
        int smaller_number;
        if(a < b){
            smaller_number = a;
        } else {
            smaller_number = b;
        }
        
        int gcd = 1;
        for(int i = 1; i <= smaller_number; i++){
            if(a%i == 0 && b%i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
}

public class gcd_of_two_numbers {
    public static void main(String[] args) {
        Solution x = new Solution();
        int res = x.gcd(2048, 6784);
        System.out.println("The gcd is "+res);
    }
}
