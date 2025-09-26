class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int arr[]=new int[n];
        Arrays.fill(arr,1);
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                arr[i]=arr[i-1]+1;

            }
        }
        for(int j=n-2;j>=0;j--){
            if(ratings[j]>ratings[j+1]){
                arr[j]=Math.max(arr[j+1]+1,arr[j]);
            }
        }
        int cnt=0;
        for(int i:arr){
            cnt+=i;
        }
        return cnt;
        
    }
}