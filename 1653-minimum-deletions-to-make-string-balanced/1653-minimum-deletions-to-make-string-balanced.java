class Solution {
    public int minimumDeletions(String s) {
        int n=s.length();
      
       int acount=0;
       for(int i=0;i<n;i++){
        if(s.charAt(i)=='a'){
            acount++;
        }
       }
        int bcount=0;
        int seenA=0;

        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='a'){
                seenA++;
            }
            min=Math.min(min,(acount-seenA)+bcount);
            if(s.charAt(i)=='b'){
                bcount++;
            }
        }
        return min;

        
    }
}