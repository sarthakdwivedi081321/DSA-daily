class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long sum=0,min=0,max=0;
        for(int i:differences){
            sum+=i;
            min=Math.min(sum,min);
            max=Math.max(sum,max);
        }
        lower-=min;
        upper-=max;
        return (int)Math.max(0,(upper-lower+1));
        
    }
}