class Solution {
    public int numberOfSubstrings(String s, int k) {
        int n=s.length();
        int lft=0,rgt=0,g=0,cnt=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(rgt<n){
            char ch=s.charAt(rgt);
            map.put(ch,map.getOrDefault(ch,0)+1);
            int val=map.get(ch);
            while(map.get(ch)==k){
                cnt+=n-rgt;
                char ch1=s.charAt(lft);
                map.put(ch1,map.get(ch1)-1);
                lft+=1;
            }
            rgt+=1;
        }
        return cnt;
        
    }
}