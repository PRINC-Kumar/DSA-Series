class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
       HashMap<Integer,Integer> m1=new HashMap<>();
       m1.put(0,-1);
       int sum=0;
       for(int i=0;i<nums.length;i++){
           sum+=nums[i];
           int mod=sum%k;

           
           if(m1.containsKey(mod)){
                int tempidx=m1.get(mod);
                    if(i-tempidx>=2){
                    return true;
                 }
            }
            else{
            m1.put(mod,i);
            }

        }
        return false;

        
    }
}