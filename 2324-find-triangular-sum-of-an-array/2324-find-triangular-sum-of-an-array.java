class Solution {
    public int triangularSum(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        for(int i:nums){
            ans.add(i);
        }
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        List<Integer> ans1=new ArrayList<>();
        List<Integer> ans2=new ArrayList<>();
        for(int i=1;i<=n-1;i++){
            if(i==1){
                for(int j=1;j<ans.size();j++){
                    ans1.add((ans.get(j)+ans.get(j-1))%10);

                }
            }
            else{
                ans2.clear();
                for(int k=1;k<ans1.size();k++){
                    ans2.add((ans1.get(k)+ans1.get(k-1))%10);
                }
                ans1.clear();
                for(int l:ans2){
                    ans1.add(l);
                }

            }
        }
        return ans1.get(0);

        
    }
}