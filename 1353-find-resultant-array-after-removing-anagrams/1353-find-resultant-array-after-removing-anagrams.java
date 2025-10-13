class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans=new ArrayList<>();
        List<String> ans1=new ArrayList<>();
        int l=0;
        for(int i=0;i<words.length;i++){
            char ch[]=words[i].toCharArray();
            Arrays.sort(ch);
            String st=new String(ch);
            if(i!=0 && ans1.get(l-1).equals(st)){
                continue;
            }
            else{
                ans.add(words[i]);
                ans1.add(st);
                l++;
            }
        }
        return ans;
        
    }
}