class Solution {
    // int operation =0;
    // public int check(int val){
    //     if(val%3==0){
    //         return 0;
    //     }
    //     int add=1+check(val+1);
    //     int sub=1+check(val-1);
    //     return Math.min(add,sub);
    // }

    public int minimumOperations(int[] nums) {
        if(nums.length==0) return 0;
        int operation=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]%3==0){
            operation+=0;
        
           }
           else if(nums[i]%3==1){
            operation+=1;
           }
           else{
            operation+=1;
           }

        }
        return operation;
        
    }
}