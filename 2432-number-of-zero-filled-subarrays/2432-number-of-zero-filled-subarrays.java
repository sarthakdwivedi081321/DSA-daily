class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n=nums.length;
        long cnt=0,cnt1=0;
        for(int i:nums){
            if(i==0){
                cnt1+=1;
                cnt+=cnt1;

            }
            else{
                cnt1=0;
            }
        }
        return cnt;
        
    }
}