class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        Arrays.fill(arr1,1);
        Arrays.fill(arr2,1);
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                arr1[i]=arr1[i-1]+1;
            }
        }
        for(int j=n-2;j>=0;j--){
            if(ratings[j]>ratings[j+1]){
                arr2[j]=Math.max(arr1[j],arr2[j+1]+1);
            }
        }
        int min=0;
        for(int i=0;i<n;i++){
            min+=Math.max(arr1[i],arr2[i]);
        }
        
        return min;
    }
}