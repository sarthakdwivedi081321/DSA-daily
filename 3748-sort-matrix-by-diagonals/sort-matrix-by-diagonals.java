class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n=grid.length;
        HashMap<Integer,PriorityQueue<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int val=grid[i][j];
                int d=i-j;
                if(d>=0){
                    map.computeIfAbsent(d,k->new PriorityQueue<>(Collections.reverseOrder())).add(grid[i][j]);
                }
                else{
                    map.computeIfAbsent(d,k->new PriorityQueue<>()).add(grid[i][j]);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int d=i-j;
                grid[i][j]=map.get(d).poll();
            }
        }
        return grid;
        
    }
}