class Solution {
    public int partitionString(String s) {
        String ss="";
         int count=1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(ss.contains(String.valueOf(c))){
                ss=""+c;
                count++;
            }
            else{
                ss=ss+c;
            }

        }
        return count;
        
    }
}