class Solution {
    private void permutation(int[] nums,boolean[] store, List<Integer> current,List<List<Integer>> ans){
        if(current.size()==nums.length ){
            ans.add(new ArrayList(current));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!store[i]){
                store[i]=true;
                 current.add(nums[i]);
                permutation(nums,store,current,ans);
                current.remove(current.size()-1);
                 store[i]=false;
            
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> s1=new ArrayList<>();
        boolean[] store=new boolean[nums.length];

        permutation(nums,store,new ArrayList<>(),s1);
        return s1;   
    }
}