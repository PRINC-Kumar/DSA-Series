class Solution {
    public int countPalindromicSubsequence(String s) {
        char[] ss=s.toCharArray();
        int n=ss.length;
        Set<Character> s1= new HashSet<>();
        for(char c: ss){
            s1.add(c);
        }
       
        int result=0;

        for(char letter : s1){
            // selet individual
            int left_idx=-1;
            int right_idx=-1;

            for(int i=0;i<n;i++){
                if(letter==ss[i]){
                    left_idx=i;
                    break;
                }
            }
            for(int i=n-1;i>=0;i--){
                if(letter==ss[i]){
                    right_idx=i;
                    break;
                }
            }
            if(right_idx-left_idx<=1) continue;

            Set<Character> s2=new HashSet<>();
            for(int i=left_idx+1;i<=right_idx-1;i++){
                s2.add(ss[i]);
            }
            result+=s2.size();

        }
        return result;
         
        
    }
}