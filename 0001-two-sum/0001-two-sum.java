class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        int arr[]=new int[2];
        for(int j=0;j<n;j++){
            int i=nums[j];
            int val=target-i;
            if(map.containsKey(val)){
                arr[0]=map.get(val);
                arr[1]=j;
                break;

            }
            map.put(i,j);
        }
        return arr;
        
    }
}