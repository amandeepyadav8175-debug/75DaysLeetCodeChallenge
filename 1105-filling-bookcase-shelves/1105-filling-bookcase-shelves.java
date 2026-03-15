class Solution {
    int width;
    int remainwt;
    public int minHeightShelves(int[][] books, int shelfWidth) {
         remainwt=  shelfWidth;
        width=  shelfWidth;
        int dp[][]= new int[books.length][shelfWidth+1];
        for(int i=0;i<books.length;i++){
            Arrays.fill(dp[i],-1);
        }

        return recur(books,0, remainwt,0,dp);
        
    }

    public int recur(int [][] books,int i,int remainwt,int maxht,int dp[][]){
        if(i>= books.length) return maxht;

        int currbookwt=books[i][0];
        int currbookht=books[i][1];
        int pick=Integer.MAX_VALUE;
         int nopick=Integer.MAX_VALUE;

         if(dp[i][remainwt]!= -1) return dp[i][remainwt];

        if(currbookwt<=remainwt){
            pick= recur(books,i+1,remainwt-currbookwt,Math.max(maxht,currbookht),dp);
        }
        nopick= maxht+ recur(books,i+1,width-currbookwt,currbookht,dp);

        dp[i][remainwt]= Math.min(pick,nopick);
        return dp[i][remainwt];
    }
}