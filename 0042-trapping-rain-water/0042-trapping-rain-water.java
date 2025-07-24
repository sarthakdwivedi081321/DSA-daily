class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        int arr3[]=new int[n];
        int lft=0,rgt=0,cnt=0;
        for(int i=0;i<n;i++){
            if(height[i]>lft){
                lft=height[i];
            }
            arr1[i]=lft;
        }
        for(int j=n-1;j>=0;j--){
            if(height[j]>rgt){
                rgt=height[j];
            }
            arr2[j]=rgt;
        }
        for(int i=0;i<n;i++){
            arr3[i]=Math.min(arr1[i],arr2[i]);
        }
        for(int i=0;i<n;i++){
            cnt+=arr3[i]-height[i];
        }
        return cnt;

        
    }
}