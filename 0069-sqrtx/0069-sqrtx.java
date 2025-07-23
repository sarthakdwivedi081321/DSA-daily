class Solution {
    public int mySqrt(int x) {
        int l=0,h=x;
        while(l<h){
            int mid=(l+h+1)>>1;
            if(mid>x/mid){
                h=mid-1;
            }
            else{
                l=mid;
            }
        }
        return l;
        
    }
}