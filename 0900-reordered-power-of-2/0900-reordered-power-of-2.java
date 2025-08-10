class Solution {
    public boolean reorderedPowerOf2(int n) {
        char ch[]=(String.valueOf(n)).toCharArray();
        Arrays.sort(ch);
        for(int i=0;i<32;i++){
            int j=1<<i;
            char ch1[]=(String.valueOf(j)).toCharArray();
            Arrays.sort(ch1);
            if(Arrays.equals(ch,ch1)){
                return true;
            }

        }
        return false;
        
    }
}