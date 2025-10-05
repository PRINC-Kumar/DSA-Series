class Solution {
    public int addDigits(int num) {
        while(num>9){
            int n=num;
            int r=0;
            while(n!=0){
                r+=n%10;
                n=n/10;

            }
            num=r;
        }
        return num;
    }
}