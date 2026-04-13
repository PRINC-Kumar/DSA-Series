class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int mi=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){

                mi=Math.min(mi,Math.abs(i-start));
            }
        }
        return mi;
        
    }
}