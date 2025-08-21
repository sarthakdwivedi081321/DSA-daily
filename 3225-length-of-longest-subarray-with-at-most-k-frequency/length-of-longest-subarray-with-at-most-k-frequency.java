class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n=nums.length;
        int lft=0;
        int mx=0;
        int mx1=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int val=nums[i];
            map.put(val,map.getOrDefault(val,0)+1);
            int val1=map.get(val);
            while(val1>k && map.get(val)>k){
                map.put(nums[lft],map.get(nums[lft])-1);
                lft++;
                

            }
            mx1=Math.max(mx1,i-lft+1);
        }
        return mx1;
        
    }
}