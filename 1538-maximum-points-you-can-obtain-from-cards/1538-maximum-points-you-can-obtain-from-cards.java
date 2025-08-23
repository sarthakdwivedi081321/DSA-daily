class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int size=n-k;
        int sum=0,sum1=0;
        for(int i:cardPoints){
            sum+=i;
        }
        if(n==k){
            return sum;
        }
        for(int i=0;i<size;i++){
            sum1+=cardPoints[i];
        }
        int sum2=sum1;
        for(int j=size;j<n;j++){
            sum2+=cardPoints[j]-cardPoints[j-size];
            sum1=Math.min(sum1,sum2);


        }
        return sum-sum1;
        
    }
}