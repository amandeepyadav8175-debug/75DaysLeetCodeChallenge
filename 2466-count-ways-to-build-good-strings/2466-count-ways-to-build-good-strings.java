class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        int maxlen=high+ Math.max(zero,one);//5 last case
        int dp[]= new int[maxlen+1];
       // Arrays.fill(dp,-1);
       for(int len=high;len>=0;len--){
         int zerolen=len+zero;
        int onelen =len+ one;
        int zerocount=(zerolen>=low && zerolen<=high)?1:0;
        int onecount=(onelen>=low && onelen<=high)?1:0;

        int result=zerocount + dp[zerolen] +  onecount +dp[onelen];

         dp[len]=result%(1000000007);

       }
        return dp[0];//recur(low,high,zero,one,0,dp);
        
    }
   
}