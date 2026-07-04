class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int fre[]= new int[n+1];
        int count[]= new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            fre[A[i]]++;
            if(fre[A[i]]==2) c++;
            fre[B[i]]++;
            if(fre[B[i]]==2) c++;
            count[i]= c;
        }
        return count;
        
    }
}