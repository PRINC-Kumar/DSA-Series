class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> s1=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!s1.isEmpty() && s1.peek()==c ){
                s1.pop();
            }
            else{
                s1.push(c);
            }
        }
        String ans="";
        while(!s1.isEmpty()){
            ans=s1.pop()+ans;
        }
        return ans;


    }
}