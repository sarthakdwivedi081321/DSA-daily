class Solution {
    public int maxArea(int[] height) {
        int h=height.length-1,l=0,dif=0,min=0;
        int mx=0;
        while(l<h){
            min=Math.min(height[l],height[h]);
            dif=h-l;
            int area=dif*min;
            mx=Math.max(area,mx);
            if(height[l]<height[h]){
                l++;
            }
            else{
                h--;
            }
        }
        return mx;


        
    }
}