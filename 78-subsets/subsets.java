class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        int i=1<<n;
        for(int j=0;j<i;j++){
            List<Integer> ans1=new ArrayList<>();
            for(int t=0;t<n;t++){
                if((j&(1<<t))!=0){
                    ans1.add(nums[t]);
                }

            }
            ans.add(ans1);
        }
        return ans;
        
    }
}