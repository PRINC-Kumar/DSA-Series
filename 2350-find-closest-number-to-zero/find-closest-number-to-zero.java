class Solution {
    public int findClosestNumber(int[] nums) {
        int colsest=nums[0];
        for(int i=1;i<nums.length;i++){
            int current=nums[i];
        
            if(Math.abs(current)<Math.abs(colsest)||Math.abs(current)==Math.abs(colsest)&&
            current>colsest){
                colsest=current;
            }
        }
        return colsest;
        
    }
}