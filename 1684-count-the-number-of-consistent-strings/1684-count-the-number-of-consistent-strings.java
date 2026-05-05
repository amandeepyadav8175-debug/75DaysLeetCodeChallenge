class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set= new HashSet<>();
        int count=0;

        for(char ch: allowed.toCharArray()){
            set.add(ch);
        }
        for(String str:words){
            boolean flag= true;
            for(char ch :str.toCharArray()){
                if(!set.contains(ch)){
                    flag=false;
                }
            }
            if(flag) count++;// flag==true;

        }
        return count;

        
    }
}