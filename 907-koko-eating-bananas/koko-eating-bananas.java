class Solution {
    public static int maximum(int []piles){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
            
        }
        return max;

    }
    public static int perhour(int[]piles,int hour){
        int minhour=0;
        for(int i=0;i<piles.length;i++){
           minhour += Math.ceil((double)piles[i] / hour);

        }
        return minhour;

    }
    public int minEatingSpeed(int[] piles, int h) {

        int high=maximum(piles);
        int low=1;
        while(low<=high){
            int mid=(low+high)/2;
            int totalhour=perhour(piles,mid);
            if(totalhour<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low; 
    }
}