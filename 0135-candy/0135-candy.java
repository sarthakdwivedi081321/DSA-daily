class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int arr1[]=new int[n];
        Arrays.fill(arr1,1);
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                arr1[i]=arr1[i-1]+1;
            }
        }
        for(int j=n-2;j>=0;j--){
            if(ratings[j]>ratings[j+1]){
                arr1[j]=Math.max(arr1[j+1]+1,arr1[j]);
            }
        }
        int cnt=0;
        for(int i:arr1){
            cnt+=i;
        }
        return cnt;


        
    }
}