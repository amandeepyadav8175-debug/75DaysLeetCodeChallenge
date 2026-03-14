class Solution {
    public int firstUniqueEven(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int k: nums){
            map.put(k,map.getOrDefault(k,0)+1);
        }
        for(int k:nums){
            if(k%2==0){
                if(map.get(k)==1){
               
                    return k;
                 
                   
                }
               
            }
           
           
        }
        return -1;
        
    }
}