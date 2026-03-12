class Solution {
    public int findLongestChain(int[][] pairs) {
       int n= pairs.length;
       int arr[][]= new int [n][3];

       for(int i=0;i<n;i++){
        arr[i][0]=pairs[i][0];// start;
        arr[i][1]= pairs[i][1];// end
        arr[i][2]= i;// original indx
       }
       Arrays.sort(arr,(a,b)-> a[1]-b[1]);// on the basis of end time
       List<Integer> ans= new ArrayList<>();
       int count=1;
       ans.add(arr[0][2]);
       int chainend= arr[0][1];
       for(int i=1;i<n;i++){
        if(arr[i][0]> chainend){//  n0 >= becuse strictlu inc
            count++;
            ans.add(arr[i][2]);
            chainend=arr[i][1];
        }
       }
       return count;
        
    }
}