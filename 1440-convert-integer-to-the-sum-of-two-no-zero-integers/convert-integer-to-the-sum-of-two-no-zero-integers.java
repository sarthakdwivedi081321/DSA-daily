class Solution {
    public int[] getNoZeroIntegers(int n) {
        int arr[]=new int[2];
        int l=1,j=n-1;
        while(l<=j){
            String str=String.valueOf(l);
            String str1=String.valueOf(j);
            if(str.indexOf('0')<0 && str1.indexOf('0')<0){
                arr[0]=l;
                arr[1]=j;
                break;
            }
            l++;
            j--;
        }
        return arr;
        
    }
}