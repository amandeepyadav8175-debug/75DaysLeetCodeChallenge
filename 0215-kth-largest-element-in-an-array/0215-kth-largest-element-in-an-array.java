class Solution {
    public int findKthLargest(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        // count frequency
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
         Collections.sort(list, (a, b) -> b.getKey() - a.getKey());
           List<Integer> result = new ArrayList<>();
           int count =0;
           for(Map.Entry<Integer,Integer> e:list){  //[6(1),5(2),4(1),....]
            count+=e.getValue();// first give 1,2,1
            if(count>=k){
                return e.getKey();
            }

           }
           return -1;
        
    }
}