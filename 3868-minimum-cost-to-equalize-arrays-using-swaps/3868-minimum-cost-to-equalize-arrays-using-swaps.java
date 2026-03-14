class Solution {
    public int minCost(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int k: nums1){
            map.put(k,map.getOrDefault(k,0)+1);
        }
         for(int k: nums2){
            map.put(k,map.getOrDefault(k,0)+1);
        }

        for(int k: map.values()){
            if(k%2!=0) return -1;
        }
         Map<Integer,Integer> diff = new HashMap<>();
        for(int k: nums1){
            diff.put(k,diff.getOrDefault(k,0)+1);
        }
         for(int k: nums2){
            diff.put(k,diff.getOrDefault(k,0)-1);
        }
        List<Integer> extra1= new ArrayList<>();
         List<Integer> extra2= new ArrayList<>();

         for(int k: diff.keySet()){
            int d= diff.get(k);

            if(d>0){
            for(int i=0;i<d/2;i++){
                extra1.add(k);
            }

         }
            if(d<0){
                 for(int i=0;i< -d/2;i++){
                extra2.add(k);
            }

            }}
            Collections.sort(extra1);
            Collections.sort(extra2,Collections.reverseOrder());
            int cost=0;

            for(int i=0;i<extra1.size();i++){
                if(!extra1.get(i).equals(extra2.get(i))){
                    cost++;
                }
            }
          return cost;

        
    }
}