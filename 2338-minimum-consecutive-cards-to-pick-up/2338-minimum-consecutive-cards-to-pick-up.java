class Solution {
    public int minimumCardPickup(int[] cards) {
        int n=cards.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int cnt=0,min=n+1;
        for(int rgt=0;rgt<n;rgt++){
            int val=cards[rgt];
            if(map.containsKey(val)){
                min=Math.min(min,rgt-map.get(val)+1);


            }
            map.put(val,rgt);
        
        }
        if(min==n+1){
            return -1;
        }
        else{
            return min;
        }
    }
}
        
    
