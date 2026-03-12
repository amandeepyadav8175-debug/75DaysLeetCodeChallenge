class Solution {
    public int findLongestChain(int[][] pairs) {
        int n=pairs.length;
        Arrays.sort(pairs,(a,b)->a[0]-b[0]);
        int lis[]= new int[n];
        Arrays.fill(lis,1);
        int maxlen=1;
        for(int i=1;i<n;i++){
            for(int pre=0;pre<i;pre++){
                if(pairs[pre][1]<pairs[i][0]){
                    lis[i]=Math.max(lis[i],1+lis[pre]);
                }
            }
            if(lis[i]>maxlen){
                maxlen=lis[i];
            }
        }
        return maxlen;
        
        
    }
}