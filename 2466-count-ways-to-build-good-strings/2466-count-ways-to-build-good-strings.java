class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        int maxlen=high+ Math.max(zero,one);//5 last case
        int dp[]= new int[maxlen+1];
        Arrays.fill(dp,-1);
        return recur(low,high,zero,one,0,dp);
        
    }
    public int recur(int low,int high,int zero,int one,int len,int[]dp){
        if(len>high) return 0;
        if(dp[len]!=-1) return dp[len];
        int zerolen=len+zero;
        int onelen =len+ one;
        int zerocount=(zerolen>=low && zerolen<=high)?1:0;
        int onecount=(onelen>=low && onelen<=high)?1:0;

        int result=zerocount +recur(low,high,zero,one,zerolen,dp)+
                   onecount+recur(low,high,zero,one,onelen,dp);

        return  dp[len]=result%(1000000007);
    }
}