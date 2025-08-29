class Solution {
    public int[] singleNumber(int[] nums) {
        int val=0;
        for(int i:nums){
            val^=i;
        }
        int val1=val&(-val);
        int a=0,b=0;
        for(int i:nums){
            if((i&(val1))==0){
                a^=i;
            }
            else{
                b^=i;
            }
        }
        return new int[]{a,b};

        
    }
}