class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int lft=0,cnt=0,j=0,k=0,mx=0,l=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                lft=i;
                j=i;
                break;
            }
        }
        for(int rgt=j;rgt<n;rgt++){
            while(nums[rgt]==0 && cnt==1 && lft<n){
                mx=Math.max(mx,rgt-lft-cnt);
                if(k!=0){
                    lft=k+1;
                    k=0;
                }
                if(nums[lft]==1){
                    cnt=0;
                    break;
                }
                lft++;
            }
            if(nums[rgt]==0){
                l=1;
                cnt=1;
                k=rgt;
            }
        }
        if(l==0 && j!=0){
            mx=Math.max(mx,(n-lft));

        }
        mx=Math.max(mx,((n-1)-lft));
        return mx;
        
        
    }
}