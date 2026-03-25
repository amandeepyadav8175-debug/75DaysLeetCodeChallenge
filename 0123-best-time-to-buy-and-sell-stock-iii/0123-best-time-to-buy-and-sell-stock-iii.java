class Solution {
    public int maxProfit(int[] prices) {
        int dp[][][]= new int[prices.length+1][2][3];//0,1// handles base case prices.length+1 like if(indx==prices.length) return 0; we hold when i==prices+1;// here no need to fill so int dp[]
         int profit=0;
         for(int indx=prices.length-1;indx>=0;indx--){
            for(int canbuy=0;canbuy<=1;canbuy++){
                for(int limit=1;limit<=2;limit++){
         
        if(canbuy==1){
            int buy= -prices[indx]+ dp[indx+1][0][limit];//recur(indx+1,0,prices,dp);
            int skip=0+dp[indx+1][1][limit]; // recur(indx+1,1,prices,dp);
            profit=Math.max(buy,skip);
        }else{
            int sell=prices[indx]+  dp[indx+1][1][limit-1];//recur(indx+1,1,prices,dp);
            int skip=0+ dp[indx+1][0][limit];//recur(indx+1,0,prices,dp);
            profit=Math.max(sell,skip);
        }
        dp[indx][canbuy][limit] = profit;
            }}}
      
        return dp[0][1][2];//recur(0,1,prices,dp);
        
    }}
    //What is dp[n][0] and dp[n][1] ?
//   So what is profit after last day?

// No matter what:

// You cannot buy ❌
// You cannot sell ❌

// 👉 Profit = 0
// dp[n][0] = 0
// dp[n][1] = 0