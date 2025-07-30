class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int arr[]=new int[32];
        Arrays.fill(arr,-1);
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<32;j++){
                if(((nums[i]>>j)&1)!=0){
                    arr[j]=i;
                }
            }
            int min=i;
            for(int k=0;k<32;k++){
                if(arr[k]!=-1){
                    min=Math.max(min,arr[k]);
                }

            }
            ans[i]=min-i+1;
        }
        return ans;
        
    }
}