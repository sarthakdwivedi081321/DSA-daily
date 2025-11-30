class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        String s="";
        int n=nums.length;
        int a=0;
        List<Boolean> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            a=(a*2+nums[i])%5;
            arr.add(a==0);

        }
        return arr;
        
    }
}