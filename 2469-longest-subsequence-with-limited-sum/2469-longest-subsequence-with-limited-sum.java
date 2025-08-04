class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int ans=0;
        int n=nums.length;
        int m=queries.length;
        Arrays.sort(nums);
        int arr[]=new int[m];
        for(int i=0;i<m;i++){
            int val=queries[i];
            int sum=0;
            int cnt=0;
            for(int j=0;j<n;j++){
                int val1=nums[j];
                if(val1<=val){
                    sum+=val1;
                    val-=val1;
                    cnt+=1;
                }
                
            }
            arr[i]=cnt;
        }
        return arr;

        
    }
}