class Solution {
    public int minimumArea(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int minr=m,minc=n;
        int maxr=-1,maxc=-1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    minr=Math.min(i,minr);
                    minc=Math.min(j,minc);
                    maxr=Math.max(i,maxr);
                    maxc=Math.max(j,maxc);
                }
            }
        }
        return (maxr-minr+1)*(maxc-minc+1);

        
        
    }
}