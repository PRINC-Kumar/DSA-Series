class Solution {
    public int search(int[] nums, int target) {
        int number=-1;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i])
            return i;

         }
         return number;
        
    }
}