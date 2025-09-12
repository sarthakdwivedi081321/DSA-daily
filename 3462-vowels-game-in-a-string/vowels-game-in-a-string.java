class Solution {
    public boolean doesAliceWin(String s) {
        int n=s.length();
        int cnt=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                cnt+=1;
            }
        }
        if(cnt==0){
            return false;
        }
        else{
            return true;
        }
        
    }
}