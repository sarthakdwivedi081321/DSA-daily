class Solution {
    public String largestGoodInteger(String num) {
        int n=num.length(),mx=0;
        String str="";
        for(int i=0;i<n-2;i++){
            char ch=num.charAt(i);
            char ch1=num.charAt(i+1);
            char ch2=num.charAt(i+2);
            if(ch==ch1 && ch1==ch2 && ch==ch1){
                int val=ch;
                if(val>mx){
                    str=num.substring(i,i+3);
                    mx=val;
                }
            }

        }
        return str;
        
    }
}