class Solution {
    public long minimumSteps(String s) {
        int n= s.length();
        int last=0;
        long swapcount=0;
        for(int cur=0;cur<n;cur++){
            if(s.charAt(cur)=='0'){
                swapcount+=(cur-last);
                last++;
            }
        }
        return swapcount;
        
    }
}