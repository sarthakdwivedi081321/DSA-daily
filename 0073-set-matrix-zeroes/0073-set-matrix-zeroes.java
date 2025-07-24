class Solution {
    public void setZeroes(int[][] matrix) {
        int n1=matrix.length;
        int n2=matrix[0].length;
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(matrix[i][j]==0){
                    arr1[i]=1;
                    arr2[j]=1;
                }
            }
        }
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(arr1[i]==1 || arr2[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
        
    }
}