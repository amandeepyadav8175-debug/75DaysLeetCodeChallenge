class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n= obstacleGrid[0].length;


        return uniquePaths(obstacleGrid,m,n);
        
    }
    public int uniquePaths(int[][] obstacleGrid,int m, int n) {
        int pre[]= new int[n+1]; // shifting logic
        for(int i=0;i<m+1;i++){
            int curr[]= new int[n+1];
           for(int j=0;j<n+1;j++){
            if(i==0 || j==0||  obstacleGrid[i-1][j-1]==1){// 1 measn obstacle m-1 && n-1 shifting logic
               curr[j]=0;
            }else if( i==1 && j==1){
                curr[j]=1;
            }else{
                curr[j]= pre[j]+ curr[j-1];
            }
           }
           pre= curr;
        }

        return pre[n];
        
    }
    
}
