class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> s1=new HashSet<>();
        int max=0;int left=0;
        for(int right=0;right<s.length();right++){
            while(s1.contains(s.charAt(right))){
                s1.remove(s.charAt(left));
                left++;
        
            }
            s1.add(s.charAt(right));
            max=Math.max(max,right-left+1);
                     
        }
        return max;
        
    }
}