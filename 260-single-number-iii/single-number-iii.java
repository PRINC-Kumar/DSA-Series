class Solution {
    public int[] singleNumber(int[] nums) {
        
        long  exor=0;
        for(int i=0;i<nums.length;i++){
            exor^=nums[i];
        }
        long rightmostbit=(exor&exor-1)^exor;
        int b1=0,b2=0;
        for(int i=0;i<nums.length;i++){
            if((rightmostbit & nums[i])==0){
                b1=b1^nums[i];
            }
            else{
                b2^=nums[i];
            }
        }
        int [] arr=new int [2];
        arr[0]=b1;
        arr[1]=b2;
        
        return arr;
    }
}