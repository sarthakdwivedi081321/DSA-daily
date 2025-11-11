class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++){
            int b=nums[i];
            if(map.containsKey(target-b)){
                arr[0]=map.get(target-b);
                arr[1]=i;
                break;

            }
            else{
                map.put(b,i);
            }
        }
        return arr;
        
    }
}