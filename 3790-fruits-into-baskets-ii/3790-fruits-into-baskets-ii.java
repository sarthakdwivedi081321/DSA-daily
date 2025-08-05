class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int cnt=0,k=0;
        int n=fruits.length;
        for(int i=0;i<n;i++){
            k=0;
            for(int j=0;j<n;j++){
                if(fruits[i]<=baskets[j]){
                    k=1;
                    baskets[j]=0;
                    break;
                }
            }
            if(k==0){
                cnt+=1;
            }

        }
        return cnt;
    }
}