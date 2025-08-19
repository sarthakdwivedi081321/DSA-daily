class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length,val=0;
        int arr[]=new int[2*n];
        int cnt=0,cnt1=1;
        for(int i:nums){
            if(i==1){
                cnt+=1;
            }
        }
        int min=cnt,lft=0;
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
            arr[n+i]=nums[i];
        }
        for(int rgt=0;rgt<2*n;rgt++){
            if(cnt1==cnt){
                if(arr[rgt]==0){
                    val+=1;
                }
                min=Math.min(min,val);
                if(arr[lft]==0){
                    val-=1;
                }
                lft++;

            }
            else{
                if(arr[rgt]==0){
                    val+=1;
                }
                cnt1+=1;
            }

        }
        return min;
        
    }
}