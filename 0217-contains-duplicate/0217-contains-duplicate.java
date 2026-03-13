class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int k: nums){
            map.put(k,map.getOrDefault(k,0)+1);
        }
        for(int k:map.values()){
            if(k>=2){
                return true;
            }

        }
        return false;
        
    }
}