class Solution {
    public int pivotInteger(int n) {
        int totalsum=0;
        int ans=-1;
        for(int i=1;i<=n;i++){
            totalsum+=i;

        }
        int halfsum=0;
        for(int i=n;i>=1;i--){
           
            halfsum+=i;
             if(halfsum==totalsum ){
                ans =i;
                break;
            }
             totalsum-=i;
        }
        return ans;
        
    }
}