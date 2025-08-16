class Solution {
    public int maximum69Number (int num) {
        String str=String.valueOf(num);
        int n=str.length();
        int a=str.indexOf('6');
        if(a<0){
            return num;
        }
        else{
            String str1=str.substring(0,a)+'9'+str.substring(a+1);
            int b=Integer.parseInt(str1);
            return b;
        }
        
    }
}