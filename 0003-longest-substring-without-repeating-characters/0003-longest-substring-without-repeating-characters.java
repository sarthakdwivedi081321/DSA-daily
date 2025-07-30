class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int lft=0,rgt=0;
        int mx=0;
        HashSet<Character> ans=new HashSet<>();
        while(rgt<n){
            char ch=s.charAt(rgt);
            while(ans.contains(ch)){
                char ch1=s.charAt(lft);

                ans.remove(ch1);
                lft++;
            }
            ans.add(ch);
            rgt++;
            mx=Math.max(mx,rgt-lft);
        }
        return mx;
        
    }
}