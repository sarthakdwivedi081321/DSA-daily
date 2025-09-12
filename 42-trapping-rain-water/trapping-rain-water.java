class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int height1[]=new int[n];
        int height2[]=new int[n];
        int val1=0,val2=0;
        for(int i=0;i<n;i++){
            height1[i]=Math.max(height[i],val1);
            val1=height1[i];
        }
        for(int j=n-1;j>=0;j--){
            height2[j]=Math.max(height[j],val2);
            val2=height2[j];
        }
        int arr3[]=new int[n];
        for(int i=0;i<n;i++){
            arr3[i]=Math.min(height1[i],height2[i]);
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            cnt+=arr3[i]-height[i];
        }
        return cnt;
    }
}