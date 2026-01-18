class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int i=0;
        int j=arr.length-1;
        while(j-i+1>k ){
            int a=Math.abs(arr[i]-x);
            int b=Math.abs(arr[j]-x);
            if(a<=b){
                j--;
            }else{
                i++;
            }
        }
        List<Integer> l1=new ArrayList<>();
        for(int p=i;p<=j;p++){
            l1.add(arr[p]);
        }
        return l1;  
    }
}