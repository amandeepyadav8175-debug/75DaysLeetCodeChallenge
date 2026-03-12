class Solution {
    public int uniquePaths(int m, int n) {
        int pre[]= new int[n+1]; // shifting logic
        for(int i=0;i<m+1;i++){
            int curr[]= new int[n+1];
           for(int j=0;j<n+1;j++){
            if(i==0 || j==0){
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