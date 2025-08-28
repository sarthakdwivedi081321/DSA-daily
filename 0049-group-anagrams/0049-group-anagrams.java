class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        int n=strs.length;
        for(String str:strs){
            int n1=str.length();
            char ch[]=str.toCharArray();
            Arrays.sort(ch);
            String str1=new String(ch);
            map.computeIfAbsent(str1,k->new ArrayList<>()).add(str);

        }
        return new ArrayList<>(map.values());
    }
}