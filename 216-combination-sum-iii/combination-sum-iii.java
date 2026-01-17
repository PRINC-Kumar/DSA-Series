class Solution {
    public void code(List<List<Integer>>l2,List<Integer> l1,int k,int n, int sum,int idx){
        if(k==0 && sum==n){
            l2.add(new ArrayList<>(l1));
        }
        if( sum>n){
            return;
        }
       
        for(int i=idx;i<=9;i++){
            if(i>n) break;

            l1.add(i);
            code(l2,l1,k-1,n,sum+i,i+1);
            l1.remove(l1.size()-1);
        }

    }
     
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> l1=new ArrayList<>();
        List<List<Integer>> l2=new ArrayList<>();
        code(l2,l1,k,n,0,1);
        return l2;
    }
}