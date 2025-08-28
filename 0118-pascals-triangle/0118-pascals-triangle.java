class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ans1=new ArrayList<>();
        ans1.add(1);
        ans.add(ans1);
        for(int i=1;i<numRows;i++){
            List<Integer> ans2=new ArrayList<>();
            ans2.add(1);
            for(int j=1;j<ans.size();j++){
                ans2.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
            }
            ans2.add(1);
            ans.add(ans2);

        }
        return ans;
        
    }
}