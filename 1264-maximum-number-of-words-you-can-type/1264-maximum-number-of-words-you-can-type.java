class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int n=brokenLetters.length();
        String str[]=text.split("\\s+");
        int c=0,cnt=0;
        for(String s:str){
            c=0;
            for(int i=0;i<n;i++){
                if(s.indexOf(brokenLetters.charAt(i))>=0){
                    c=1;
                    break;
                }
            }
            if(c==0){
                cnt+=1;
            }
        }
        return cnt;
        
    }
}