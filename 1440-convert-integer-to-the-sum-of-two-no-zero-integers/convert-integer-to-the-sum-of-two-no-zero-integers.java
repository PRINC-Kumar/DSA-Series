class Solution {
    private boolean iscontainzero(int n){
        while(n>0){
            if(n%10==0){
                return true;
            }
            n=n/10;
        }
        return false;
    } 
    public int[] getNoZeroIntegers(int n) {
        int arr[]=new int [2];
        for(int i=1;i<n;i++){
            int b=n-i;
            if(!iscontainzero(b)&&!iscontainzero(i)){
                arr[0]=i;
                arr[1]=b;
                break;
            }
        }
        return arr;
    }
}