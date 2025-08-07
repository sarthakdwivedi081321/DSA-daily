class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        int n=satisfaction.length;
        Arrays.sort(satisfaction);
        int cnt=0,total=0;
        for(int i=n-1;i>=0;i--){
            cnt+=satisfaction[i];
            if(cnt>=0){
                total+=cnt;
            }
            else{
                break;
            }
        }
        return total;
        
    }
}