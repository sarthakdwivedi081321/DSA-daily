class Solution {
    public long flowerGame(int n, int m) {
        long a=n/2;
        long b=(n+1L)/2;
        long c=m/2;
        long d=(m+1L)/2;
        long ans=a*d+b*c;
        return ans;
        
        
    }
}