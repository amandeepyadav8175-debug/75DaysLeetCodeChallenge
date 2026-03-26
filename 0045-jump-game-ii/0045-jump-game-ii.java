class Solution {
    public int jump(int[] nums) {
        int n= nums.length;
        Integer[] dp= new Integer[n];
        return recur(0,nums,dp);
        
    }
    public int recur(int indx,int[] nums,  Integer[] dp){
        if(indx>=nums.length-1) return 0;// we have to stop when rech last indx and further 
       // indx
       if(dp[indx]!= null) return dp[indx];
        int minjump= Integer.MAX_VALUE;

        for(int steps=1;steps<=nums[indx];steps++){
            int pick= recur(indx+steps,nums,dp);
            if(pick!=Integer.MAX_VALUE){
            minjump=Math.min(minjump,1+pick);//First store recursion result, then check, then add 1

        }}
        dp[indx]= minjump;
        return minjump;
    }
}