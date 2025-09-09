class Solution {
    public int reverse(int x) {
       int  ans=0;
       int n=x;
        while(n!=0){
           int digit =n%10;
           if(ans>Integer.MAX_VALUE/10||ans<Integer.MIN_VALUE/10){
            return 0;
           }

           ans=(ans*10)+digit;
           n/=10;

        }
        return ans;
    }
}