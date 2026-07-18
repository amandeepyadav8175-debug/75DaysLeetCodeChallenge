class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n= intervals.length;
        int i=0;
        ArrayList<int[]> res= new ArrayList<>();
        while(i<n && intervals[i][1]< newInterval[0]){
            res.add(intervals[i]);
            i++;// start case when intevals limit is less than newInterval
        }
         while(i<n &&  newInterval[1]>= intervals[i][0]){
            newInterval[0]= Math.min(intervals[i][0],newInterval[0]);
             newInterval[1]= Math.max(intervals[i][1],newInterval[1]);
             i++;// jabtak merge ho sake merge karte rho

        }
        res.add(newInterval);
        while(i<n){// remaining ones
         res.add(intervals[i]);
         i++;

        }
         return res.toArray(new int[res.size()][]); // converst list to 2d array 
        
        
    }
}