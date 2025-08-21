class Solution {
    public int numSubmat(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    cnt+=1;
                }
                else{
                    cnt=0;
                }
                arr[i][j]=cnt;
            }
        }
        int ans=0,val=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    continue;
                }
                int mid=arr[i][j];
                for(int k=i;k>=0;k--){
                    mid=Math.min(arr[k][j],mid);
                    if(mid==0){
                        break;
                    }
                    ans+=mid;

                }
            }
        }
        return ans;
        
    }
}