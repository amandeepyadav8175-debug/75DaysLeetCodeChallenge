class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int n= values.length;
        int leftmax=values[0]+0;
        int maxscore=0;
        for(int j=1;j<n;j++){
            int rightmax=values[j]-j;
            maxscore=Math.max(maxscore,leftmax+rightmax);
            leftmax=Math.max(leftmax,values[j]+j);
            
        }
        return maxscore;
        
    }
}