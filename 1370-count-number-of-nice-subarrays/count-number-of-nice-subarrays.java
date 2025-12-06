class Solution {
    public int fun(int [] nums,int goal){
        if(goal<0) return 0;
        int l=0,r=0,count=0,sum=0;
        while(r<nums.length){
            sum+=nums[r];
            while(sum>goal){
                sum-=nums[l];
                l++;  
            }
            count+=r-l+1;
            r++;
            
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        int [] arr=new int [nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
            
        }
        return fun(arr,k)-fun(arr,k-1);
               
        
    }
}