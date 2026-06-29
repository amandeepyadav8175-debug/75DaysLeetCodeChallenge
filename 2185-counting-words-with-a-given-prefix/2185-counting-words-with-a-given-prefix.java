class Solution {
    public int prefixCount(String[] words, String pref) {
        int len= pref.length();
        int count=0;
        for(String word: words){
            if(len <= word.length()){
                String sub= word.substring(0,len);
                if(pref.equals(sub)){
                    count++;
                }
            }
        }
        return count;
        
    }
}