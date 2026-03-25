class Solution {
    public int maxProfit(int[] prices, int fee) {
         int next[]= new int[2];//0,1// handles base case prices.length+1 like if(indx==prices.length) return 0; we hold when i==prices+1;// here no need to fill so int dp[]
         int profit=0;
         for(int indx=prices.length-1;indx>=0;indx--){
            int curr[]= new int[2];
            for(int canbuy=0;canbuy<=1;canbuy++){
         
        if(canbuy==1){
            int buy= -prices[indx]+ next[0];//recur(indx+1,0,prices,dp);
            int skip=0+next[1]; // recur(indx+1,1,prices,dp);
            profit=Math.max(buy,skip);
        }else{
            int sell=prices[indx]+ next[1]-fee;//recur(indx+1,1,prices,dp);
            int skip=0+ next[0];//recur(indx+1,0,prices,dp);
            profit=Math.max(sell,skip);
        }
        curr[canbuy] = profit;
            }
            next=curr;
            }
      
        return next[1];//recur(0,1,prices,dp);
        

        
    }
}