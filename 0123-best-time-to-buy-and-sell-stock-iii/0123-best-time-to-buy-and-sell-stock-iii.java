class Solution {
    public int maxProfit(int[] prices) {
        Integer dp[][][]= new Integer[prices.length][2][3];//0,1  2,1,0
        return recur(0,1,prices,dp,2);
        
    }
    public int recur(int indx,int canbuy,int prices[],Integer dp[][][],int limit){//canbuy=0,1
        if(indx==prices.length) return 0;
        if(limit==0) return 0;// lmint =2,1,0 = 3 values
        if( dp[indx][canbuy][limit] != null)  return dp[indx][canbuy][limit] ;
        int profit=0;
        if(canbuy==1){
            int buy= -prices[indx]+ recur(indx+1,0,prices,dp,limit);
            int skip=0+  recur(indx+1,1,prices,dp,limit);
            profit=Math.max(buy,skip);
        }else{
            int sell=prices[indx]+  recur(indx+1,1,prices,dp,limit-1);// buy and sell complete so limit-1
            int skip=0+ recur(indx+1,0,prices,dp,limit);
            profit=Math.max(sell,skip);
        }
        dp[indx][canbuy][limit] = profit;
        return dp[indx][canbuy][limit] ;
    }
}