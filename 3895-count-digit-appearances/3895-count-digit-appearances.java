class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count=0;
       char ch=(char) (digit + '0');
        for(int k: nums){
            String str2=String.valueOf(k);
            for(char c: str2.toCharArray()){
                if(c==ch){
                    count++;
                }
            }
            
        }
        return count;
        
        
    }
}