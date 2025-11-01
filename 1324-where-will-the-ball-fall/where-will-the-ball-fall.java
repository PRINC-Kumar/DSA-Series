class Solution {
    public int[] findBall(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int arr[]=new int [n];
         
         for(int start=0;start<n;start++){
            int col=start;
            for(int row=0;row<m;row++){
                int nextcol=col+grid[row][col];

                if(nextcol<0 ||nextcol>=n ||grid[row][col]!=grid[row][nextcol]){
                    col=-1;
                    break;
                }
                else{
                    col=nextcol;
                }
            }
            arr[start]=col;
         }
         return arr;
        
    }
}