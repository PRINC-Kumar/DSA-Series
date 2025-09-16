class Solution {
    private int targetsum(int[]nums,int target,int sum,int i){
        if(i==nums.length){
            if(target==sum){
                return 1;
            }
            else{
                return 0;
            }
        }
        int p=targetsum(nums,target,sum+nums[i],i+1);
        int m=targetsum(nums,target,sum-nums[i],i+1);
        return p+m;
    }
    public int findTargetSumWays(int[] nums, int target) {
       int sum= targetsum(nums,target,0,0);
       return sum;
        
    }
}