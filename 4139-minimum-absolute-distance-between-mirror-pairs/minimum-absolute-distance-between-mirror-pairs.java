class Solution {
    public int reverse(int n){
        int ans = 0;
        while(n > 0){
            ans = (ans * 10) + n % 10;
            n /= 10;
        }
        return ans;
    }

    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer,Integer> m1 = new HashMap<>();
        int result = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            int rev = reverse(nums[i]);

            if(m1.containsKey(nums[i])){
                result = Math.min(result, i - m1.get(nums[i]));
            }

            m1.put(rev, i);
        }

        return result == Integer.MAX_VALUE ? -1 : result;
    }
}
