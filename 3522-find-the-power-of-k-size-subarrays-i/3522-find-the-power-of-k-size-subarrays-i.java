class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n=nums.length;
        int arr[]=new int[n-k+1];
        int j=0,lft=0;
        for(int rgt=0;rgt<n;rgt++){
            int val1=lft;
            while((rgt-lft)==k-1){
                if(val1<rgt && (nums[val1+1]-nums[val1])==1){
                    val1+=1;
                }
                else if(val1<rgt){
                    arr[j]=-1;
                    j++;
                    lft+=1;
                }
                else{
                    arr[j]=nums[rgt];
                    j++;
                    lft+=1;
                }
            }

        }
        return arr;

        
    }
}