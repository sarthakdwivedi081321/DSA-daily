class Solution {
    public int[] sumZero(int n) {
        int arr[]=new int[n];
        int j=0,l=1;
        if(n%2==0){
            while(n>0){
                arr[j]=l;
                j++;
                arr[j]=-l;
                j++;
                l++;
                n-=2;
            }
        }
        else{
            while(n>0){
                if(j==0){
                    arr[j]=0;
                    j++;
                    n-=1;
                }
                else{
                    arr[j]=l;
                    j++;
                    arr[j]=-l;
                    j++;
                    l++;
                    n-=2;
                }
            }

        }
        return arr;
        
    }
}