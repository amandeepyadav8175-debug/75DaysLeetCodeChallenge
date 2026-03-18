class Solution {
    public int punishmentNumber(int n) {
        int res=0;
        for(int i=1;i<=n;i++){
            String i2=Integer.toString(i*i);
            int dp[][]= new int[i2.length()][i+1];// i beacomes target beacuse os loop
            for(int j=0;j<i2.length();j++){
                Arrays.fill(dp[j],-1);
            }
            if(ispartition(0,i2,i,0,dp)){// beacuse os loop i beacomes target
                res+=(i*i);
            }
        }
        return res;
        
    }
    public boolean ispartition(int partindx,String i2,int target,int currsum,int dp[][]){// target=81=8+1=9
         int n=i2.length();
         if(partindx==n){//100|
            return (currsum==target);// here check condition 
         }
         if(currsum>target){ 
            return false;// pruning

         }
         if(dp[partindx][currsum]!=-1){
            return (dp[partindx][currsum]==1); 
         }
         for(int indx=partindx;indx<n;indx++){
            int val=Integer.parseInt(i2.substring(partindx,indx+1));
            if(ispartition(indx+1,i2,target,currsum+val,dp)){
                dp[partindx][currsum]=1;
                return true;
            }
         }
         dp[partindx][currsum]=0;
         return false;

    }
}