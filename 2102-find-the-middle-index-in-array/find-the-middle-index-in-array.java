class Solution {
    public int findMiddleIndex(int[] nums) {
        int leftsum=0;
        int rightsum=0;
        int[] n1=new int [nums.length];
        int[] n2=new int [nums.length];
        for(int i=0;i<nums.length;i++){
            leftsum+=nums[i];
            n1[i]=leftsum;
        }
          for(int i=nums.length-1;i>=0;i--){
            rightsum+=nums[i];
            n2[i]=rightsum;
        }
        for(int i=0;i<nums.length;i++){
            if(n1[i]==n2[i]){
                return i;
            }
        }
        return -1;

        
    }
}