class Solution {
    public int countSquares(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int cnt=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==1){
                    int mx=Math.min(m-i,n-j);
                    for(int k=1;k<=mx;k++){
                        if(ans(matrix,i,j,k)){
                            cnt+=1;
                        }
                        else{
                            break;
                        }
                    }
                }
            }
        }
        return cnt;
        
    }
    private boolean ans(int mtrx[][],int a,int b,int c){
        for(int i=a;i<a+c;i++){
            for(int j=b;j<b+c;j++){
                if(mtrx[i][j]!=1){
                    return false;
                }

            }
        }
        return true;
    }
}