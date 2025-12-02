class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s1=new Stack<>();

        for(int a:asteroids){
            boolean distroyed=false;
            while(!s1.isEmpty() && a<0 && s1.peek()>0){

                if(s1.peek()<-a){
                    s1.pop();
                    continue;
                }
                if(s1.peek()==-a){
                    s1.pop();
                }
                distroyed=true;
                break;
            }
            if(!distroyed){
                s1.push(a);
            }   
        }
        int [] ans =new int[s1.size()];
        for(int i=s1.size()-1;i>=0;i--){
            ans[i]=s1.pop();
        }
        return ans;
        
    }
}