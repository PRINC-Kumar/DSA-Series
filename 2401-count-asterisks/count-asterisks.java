class Solution {
    public int countAsterisks(String s) {
        boolean inbetween=false;
        int res=0;
        for(char i:s.toCharArray()){
            if(!inbetween && i=='*'){
                res++;
            }
            if(i=='|'){
                inbetween=!inbetween;
            }
        }
        return res;
    }
}