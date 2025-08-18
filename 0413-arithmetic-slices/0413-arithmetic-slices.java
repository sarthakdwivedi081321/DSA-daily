class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n=nums.length;
        int m=n-1;
        if(n<3){
            return 0;
                                
        }
        int cnt=3,cnt1=0;
        int lft=0,rgt=2;
        int cst=nums[1]-nums[0];
        while(rgt<n){
            if(cnt>3 && (nums[rgt]-nums[rgt-1]==cst)){
                cnt1+=(rgt-lft)-2;
            }
            if(nums[rgt]-nums[rgt-1]==cst){
                cnt1+=1;
                cnt+=1;

            }
            else{
                cst=nums[rgt]-nums[rgt-1];
                cnt=1;
                lft=rgt;
            }
            rgt++;

        }
        return cnt1;
        
    }
}