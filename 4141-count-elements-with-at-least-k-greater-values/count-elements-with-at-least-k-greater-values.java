class Solution {
    public int countElements(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;

        int i = 0;
        while (i < n) {
            int j = i + 1;
            while (j < n && nums[j] == nums[i]) {
                j++;
            }

            int lastIndex = j - 1;

            int greaterCount = (n - 1 - lastIndex);

            if (greaterCount >= k) {
                count += (j - i);  
            }

            i = j; 
        }

        return count;
    }
}
