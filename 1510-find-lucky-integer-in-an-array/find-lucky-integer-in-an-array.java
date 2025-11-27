class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> m1=new HashMap<>();
        for(int x:arr){
            m1.put(x,m1.getOrDefault(x,0)+1);   
        }
        int lucky=-1;
        for(int key:m1.keySet()){
            if(m1.get(key)==key){
                lucky=Math.max(lucky,key);

            }
        }
        return lucky; 
    }
}