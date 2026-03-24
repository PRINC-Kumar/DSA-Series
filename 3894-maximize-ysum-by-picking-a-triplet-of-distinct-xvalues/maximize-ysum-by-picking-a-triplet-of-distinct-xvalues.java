class Solution {
    public int maxSumDistinctTriplet(int[] x, int[] y) {
        HashMap<Integer,Integer> m=new HashMap<>();

        for(int i=0;i<x.length;i++){
            m.put(x[i],Math.max(m.getOrDefault(x[i],0),y[i]));
        }
        List<Integer> l1=new ArrayList<>(m.values());

        if(l1.size()<3) return -1;

        Collections.sort(l1);
        return l1.get(l1.size()-1)+l1.get(l1.size()-2)+l1.get(l1.size()-3);

    

        
    }
}