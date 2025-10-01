class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int a=numBottles,b=numExchange,cnt=0;

        while(a>=b){
            cnt+=(a/b);
            a=a/b+a%b;
        }
        return cnt+numBottles;
        
    }
}