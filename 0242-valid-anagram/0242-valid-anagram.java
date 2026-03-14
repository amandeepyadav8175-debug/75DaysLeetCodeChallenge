class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()) return false;
        Map<Character,Integer> map= new HashMap<>();
        for(char k:s.toCharArray()){
            map.put(k,map.getOrDefault(k,0)+1);

        }
          for(char k:t.toCharArray()){
            if(!map.containsKey(k)) return false;
            if(map.get(k)==1) map.remove(k);
            else map.put(k,map.get(k)-1);

            
          }
          return  map.isEmpty();

        
    }
}