class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n=nums.length;
        int lft=0;
        int val=0,mx=1;
        for(int rgt=0;rgt<n;rgt++){
            while((val&nums[rgt])!=0){
                val^=nums[lft];
                lft++;



            }
            val|=nums[rgt];
            mx=Math.max(mx,rgt-lft+1);

        }
        return mx;
        
    }
}