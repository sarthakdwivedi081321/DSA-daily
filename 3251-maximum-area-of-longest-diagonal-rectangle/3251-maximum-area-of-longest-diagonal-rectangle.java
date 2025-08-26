class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int n=dimensions.length;
        double mx=0;
        int ans=0;
        for(int arr1[]:dimensions){
            double d=(Math.sqrt(arr1[0]*arr1[0]+arr1[1]*arr1[1]));
            if(d>=mx){
                if(d==mx){
                    ans=Math.max(ans,arr1[0]*arr1[1]);
                }
                else{
                    ans=arr1[0]*arr1[1];
                }
                mx=d;
            }
        }
        return ans;

        
    }
}