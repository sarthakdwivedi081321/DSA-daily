class Solution {
    public int convertTime(String current, String correct) {
        String str1=current.substring(0,current.indexOf(':'));
        String str2=current.substring(current.indexOf(':')+1);
        String str3=correct.substring(0,correct.indexOf(':'));
        String str4=correct.substring(correct.indexOf(':')+1);
        int a=Integer.parseInt(str1)*60+Integer.parseInt(str2);
        int b=Integer.parseInt(str3)*60+Integer.parseInt(str4);
        int arr[]={1,5,15,60};
        int val=b-a;
        int cnt=0;
        for(int i=arr.length-1;i>=0;){
            if(val>=arr[i] && val!=0){
                val-=arr[i];
                cnt+=1;
            }
            else if(val==0){
                break;
            }
            else{
                i--;
            }
        }
        return cnt;

        
    }
}