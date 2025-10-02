class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> m1=new HashMap<>();
        Stack<Integer> s1=new Stack<>();
        for(int n:nums2){
            while(!s1.isEmpty()&& s1.peek()<n){
                m1.put(s1.pop(),n);
            }
            s1.push(n);
        }
        int arr[]=new int[nums1.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=m1.getOrDefault(nums1[i],-1);
        }
        return arr;
    }
}