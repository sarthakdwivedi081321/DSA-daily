class Solution {
    public boolean isPowerOfThree(int n) {
        double ans=n;
        if(n==0){
            return false;
        }
        for(int i=-20;i<=20;i++){
            double val=(Math.pow(3,i));
            if(val==n){
                return true;
            }
        }
        return false;
        
    }
}