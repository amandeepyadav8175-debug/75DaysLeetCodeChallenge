class Solution {
    public int numOfSubarrays(int[] arr) {
        int Mod=1000000007;
        int ev=1;
        int oc=0;
        int prefix=0;
        int res=0;
        for(int num: arr){
            prefix+=num;
            if(prefix%2==0){
                res+=oc;
                ev++;

            }else{
                res+=ev;
                oc++;
            }
            res= res% Mod;
        }
        return res;
        
    }
}