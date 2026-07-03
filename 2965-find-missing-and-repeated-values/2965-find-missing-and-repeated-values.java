class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
       // HashSet<Integer> set = new HashSet<>();
        int n= grid.length;
        int sq=n*n;
        int ans[]= new int[2];
        int currsum=0;
        int set[]= new int[sq+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               // if(set.contains(grid[i][j])){
               if(set[grid[i][j]]!=0){
                    ans[0]= grid[i][j];

                }else{
                    //set.add(grid[i][j]);
                    set[grid[i][j]]=1;
                    currsum+=grid[i][j];
                }
            }
        }
        int totalsum= sq*(sq+1)/2;
        int missing=totalsum-currsum;
        ans[1]= missing;

        return ans;
        
    }
}