class Solution {
    public boolean isPowerOfFour(int n) {
        double v=n;
        if(n==0){
            return false;
        }
        for(int i=-15;i<=15;i++){
            double ans=Math.pow(4,i);
            if(ans==v){
                return true;
            }
        }
        return false;
        
    }
}