class Solution {

    private void backtrack(int[] nums,int index,List<Integer> current,List<List<Integer>> result){
        
            result.add(new ArrayList<>(current));
         for(int i=index;i<nums.length;i++){
            if(i>index &&nums[i]==nums[i-1]){
                continue;
            }
            current.add(nums[i]);
            backtrack(nums,i+1,current,result);

            current.remove(current.size()-1);  
         }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> s1=new ArrayList<>();
         Arrays.sort(nums);

         backtrack(nums,0,new ArrayList<>(),s1);
         return s1;
        
        
    }
}