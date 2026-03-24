class Solution {
    public int combinationSum4(int[] nums, int target) {
        Integer dp[]= new Integer[target+1];
        return recur(nums,target,dp);
        
    }
    public int recur(int[] nums,int target,  Integer dp[]){
        if(target==0) return 1;
        if( target<0) return 0;
        if(dp[target]!= null) return dp[target];
        int pick=0;
        for(int i=0;i<nums.length;i++){

         pick+= recur( nums, target-nums[i],dp);
       
        }
       dp[target]= pick;
       return    dp[target];
    }

}