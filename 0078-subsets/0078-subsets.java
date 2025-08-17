class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int val=0;
        int n=nums.length;
        val=1<<n;
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<val;i++){
            List<Integer> ans1=new ArrayList<>();
            for(int l=0;l<n;l++){
                if((i&(1<<l))!=0){
                    ans1.add(nums[l]);
                }
            }
            ans.add(ans1);

        }
        return ans;
        
    }
}