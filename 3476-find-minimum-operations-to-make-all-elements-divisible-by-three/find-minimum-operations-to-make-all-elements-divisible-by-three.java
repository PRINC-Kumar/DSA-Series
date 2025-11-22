class Solution {
 

    public int minimumOperations(int[] nums) {
        if(nums.length==0) return 0;
        int operation=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]%3==0){
            continue;
           }
           operation++; 
        }
        return operation;
        
    }
}