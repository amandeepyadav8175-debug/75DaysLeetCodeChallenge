class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int targetor=0;
        for(int num: nums){
            targetor= targetor| num;
        }
        Integer dp[][]= new Integer[nums.length][targetor+1];//fill either integer value or null
        return recur(0,targetor,0,nums,dp);
        
    }
    public int recur(int indx,int targetor,int curror,int[] nums,Integer dp[][]){
        if(indx==nums.length){
            return (curror==targetor)?1:0;
        }
        if( dp[indx][curror]!= null)  return dp[indx][curror];
        int pick= recur( indx +1, targetor, curror|nums[indx], nums,dp);
         int nopick = recur( indx +1, targetor, curror, nums,dp);
         dp[indx][curror]= pick+nopick;
         return   dp[indx][curror];
    }
}