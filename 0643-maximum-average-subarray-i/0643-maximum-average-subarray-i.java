class Solution {
    public double findMaxAverage(int[] nums, int k) {
      double maxavg = Double.NEGATIVE_INFINITY;
        int n= nums.length;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];

        }
        double avg=(double) sum/k;
        maxavg=Math.max(maxavg,avg);
        for(int i=k;i<n;i++){
            //avg=1;
            sum=sum+nums[i]-nums[i-k];
            avg=(double) sum/k;
              maxavg=Math.max(maxavg,avg);

        }
         
         return maxavg;
        
    }
}