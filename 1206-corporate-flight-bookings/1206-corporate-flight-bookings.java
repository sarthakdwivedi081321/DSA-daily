class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int arr[]=new int[n];
        int n1=bookings.length;
        for(int i=0;i<n1;i++){
            int a=bookings[i][0];
            int b=bookings[i][1];
            int c=bookings[i][2];
            arr[a-1]+=c;
            if(b<n){
                arr[b]-=c;
            }
        }
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }
}