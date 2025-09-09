class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int arr[]=new int[n];
        int cnt=0,j=0;
        for(int arr1[]:bookings){
            int a=arr1[0];
            int b=arr1[1];
            int c=arr1[2];
            arr[a-1]+=c;
            if(b<n){
                arr[b]-=c;
            }

        }
        for(int i:arr){
            cnt+=i;
            arr[j]=cnt;
            j++;
        }
        return arr;

        
    }
}