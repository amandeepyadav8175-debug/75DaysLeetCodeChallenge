class Solution {
    public int minOperations(int[] nums) {
        int op=0;
        for(int i=0;i<nums.length;i++){
            int value=nums[i];

            if(i%2==0){
                while(!isprime(value)){
                    value++;
                    op++;
                }
                
            }else{
                while(isprime(value)){
                    value++;
                    op++;
                }
            }
        }
        return op;
        
        
    }
    private boolean isprime(int num){
        if(num<=1) return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0) return false;;
        }
    
    return  true;
}}