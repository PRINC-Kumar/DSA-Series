class Solution {
    private void per(int[] nums,List<Integer> s1,List<List<Integer>> s2,boolean[] bool){
        if(s1.size()==nums.length){
            s2.add(new ArrayList<>(s1));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(bool[i]){
                continue;
            }
            if(i>0 && nums[i]==nums[i-1]&&!bool[i-1]){
                continue;
            }
            bool[i]=true;
            s1.add(nums[i]);
            per(nums,s1,s2,bool);
            s1.remove(s1.size()-1);
            bool[i]=false;
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> s2=new ArrayList<>();
        List<Integer> s1=new ArrayList<>();
        Arrays.sort(nums);
        boolean[] bool=new boolean[nums.length];
        per(nums,s1,s2,bool);
        return s2;

        
    }
}