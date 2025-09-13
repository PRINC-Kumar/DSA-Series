class Solution {
    public int maxFreqSum(String s) {
        int []arr=new int [26];
        int maxv=0,maxc=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            arr[c-'a']++;
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                maxv=Math.max(maxv,arr[c-'a']);
            }
            else{
                 maxc=Math.max(maxc,arr[c-'a']);
            }
        }
        return maxc+maxv;
    }
}