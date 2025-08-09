class Solution {
    public boolean isPowerOfTwo(int n) {
        int val=n&(n-1);
        if(val==0 && n>0){
            return true;
        }
        else{
            return false;
        }
        
    }
}