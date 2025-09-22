class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> s1=new HashMap<>();
        for(int n:nums){
            s1.put(n,s1.getOrDefault(n,0)+1);
        }
        int count=0;
        for(int key:s1.values()){
            if(count<key){
                count=key;
            }

        }
        int ans=0;
            for(int key:s1.values()){
            if(count==key){
                ans+=count;
            }

        }
        return ans;
    }
}  