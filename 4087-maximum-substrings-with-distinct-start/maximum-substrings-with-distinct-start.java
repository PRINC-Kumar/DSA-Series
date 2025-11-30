class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> s1=new HashSet<>();
        for(int i=0;i<s.length();i++){
            s1.add(s.charAt(i));

        }
        return s1.size();
        
    }
}