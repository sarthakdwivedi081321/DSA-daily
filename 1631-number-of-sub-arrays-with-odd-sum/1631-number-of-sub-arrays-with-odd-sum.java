class Solution {
    public int numOfSubarrays(int[] arr){
        int n=arr.length;
        int mod=1000000007;
        int even=1,odd=0,cnt=0;
        long sum=0;
        for(int i:arr){
            sum+=i;
            if(sum%2==0){
                cnt=(cnt+odd)%mod;
                even+=1;
            }
            else{
                cnt=(cnt+even)%mod;
                odd+=1;
            }

        }
        return cnt;

        
    }
}