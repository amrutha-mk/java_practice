class Solution {
    public static int gcd(int a, int b) {
        // code here
         if(b>a){
             int temp=a;
             a=b;
             b=temp;
         }
         
         while(b!=0){
             int remainder=a%b;
             a=b;
             b=remainder;
         }
         return a;
    }
}
