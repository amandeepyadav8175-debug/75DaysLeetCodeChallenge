class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int targetor=0;
        for(int num: nums){
            targetor= targetor| num;

        }
        return recur(0,targetor,0,nums);
        
    }
    public int recur(int indx,int targetor,int curror,int[] nums){
        if(indx==nums.length){
            return (curror==targetor)?1:0;
        }
        int pick= recur( indx +1, targetor, curror|nums[indx], nums);
         int nopick = recur( indx +1, targetor, curror, nums);
         return pick+nopick;
    }
}