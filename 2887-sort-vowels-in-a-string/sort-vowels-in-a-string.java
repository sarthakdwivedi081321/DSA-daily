class Solution {
    public String sortVowels(String s) {
        int n=s.length();
        String str="";
        String str1="aeiouAEIOU";
        List<Integer> ans1=new ArrayList<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(str1.indexOf(ch)>=0){
                ans1.add((int)ch);
            }
        }
        Collections.sort(ans1);
        int k=0;
        String ans="";
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(str1.indexOf(ch)<0){
                ans+=ch;
            }
            else{
                int val=ans1.get(k);
                char ch1=(char)(val);
                ans+=ch1;
                k++;
            }
        }
        return ans;
        
    }
}