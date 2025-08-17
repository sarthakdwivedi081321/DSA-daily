class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n=grumpy.length,val=0;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(grumpy[i]==0){
                cnt+=customers[i];
            }
        }
        int cnt1=0,lft=0,mx=0;
        for(int i=0;i<n;i++){
            cnt1+=1;
            if(grumpy[i]==1){
                val+=customers[i];
            }
            if(cnt1==minutes){
                cnt1-=1;
                mx=Math.max(mx,val);
                if(grumpy[lft]==1){
                    val-=customers[lft];
                }
                lft++;

            }
        }
        return cnt+mx;
        
    }
}