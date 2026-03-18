class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        // count frequency
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0) + 1);
        }

         List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
         Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < k; i++){
            result.add(list.get(i).getKey());
        }
        int arr[]= new int[result.size()];
        for(int i=0;i<result.size();i++){
            arr[i]=result.get(i);
        }
        return arr;


        
    }
}