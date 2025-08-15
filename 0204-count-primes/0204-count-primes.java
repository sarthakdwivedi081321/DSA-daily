class Solution {
    public int countPrimes(int n) {
        boolean ans[]=new boolean[n];
        for(int i=2;i*i<n;i++){
            if(!ans[i]){
                for(int j=i*2;j<n;j+=i){
                    ans[j]=true;
                }
            }
        }
        int cnt=0;
        for(int k=2;k<n;k++){
            if(!ans[k]){
                cnt+=1;
            }
        }
        return cnt;
        
    }
}