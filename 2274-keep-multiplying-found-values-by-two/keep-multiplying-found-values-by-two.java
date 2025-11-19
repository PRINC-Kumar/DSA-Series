class Solution {
    public int findFinalValue(int[] nums, int original) {
        if(nums.length==0)return original;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==original){
                original*=2;
            }
        }
        return original;
        
    }
}