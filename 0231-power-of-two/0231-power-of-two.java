class Solution {
    public boolean isPowerOfTwo(int n) {
        int ans=n&(n-1);
        if(ans==0 && n>0){
            return true;
        }
        return false;
        
    }
}