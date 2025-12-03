class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> m1=new HashMap<>();
        m1.put(0,1);
        int prefixsum=0;
        int count=0;
        for(int num:nums){
            prefixsum+=num;
            if(m1.containsKey(prefixsum-k)){
                count+=m1.get(prefixsum-k);
            }
            m1.put(prefixsum,m1.getOrDefault(prefixsum,0)+1);
        }
        return count;
        
    }
}