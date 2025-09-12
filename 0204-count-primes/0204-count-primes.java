class Solution {
    public int countPrimes(int n) {
        boolean ans[]=new boolean[n];
        for(int j=2;j*j<n;j++){
            if(!ans[j]){
                for(int k=j*2;k<n;k+=j){
                    ans[k]=true;
                }
            }
        }
        int cnt=0;
        for(int l=2;l<n;l++){
            if(!ans[l]){
                cnt+=1;
            }
        }
        return cnt;
        
    }
}