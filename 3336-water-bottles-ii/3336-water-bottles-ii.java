class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int a=numBottles,b=numExchange;
        int cnt=0,cnt1=0;
        while(b<=a){
            cnt+=1;
            cnt1+=1;
            a-=b;
            b+=1;
            if(a<b){
                a+=cnt;
                cnt=0;
            }
        }
        return cnt1+numBottles;
        
    }
}