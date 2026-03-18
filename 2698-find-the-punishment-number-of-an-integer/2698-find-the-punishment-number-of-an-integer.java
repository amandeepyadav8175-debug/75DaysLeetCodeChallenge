class Solution {
    public int punishmentNumber(int n) {
        int res=0;
        for(int i=0;i<=n;i++){
            String i2=Integer.toString(i*i);
            if(ispartition(0,i2,i,0)){// beacuse os loop i beacomes target
                res+=(i*i);
            }
        }
        return res;
        
    }
    public boolean ispartition(int partindx,String i2,int target,int currsum){// target=81=8+1=9
         int n=i2.length();
         if(partindx==n){//100|
            return (currsum==target);
         }
         if(currsum>target) return false;
         for(int indx=partindx;indx<n;indx++){
            int val=Integer.parseInt(i2.substring(partindx,indx+1));
            if(ispartition(indx+1,i2,target,currsum+val)){
                return true;
            }
         }
         return false;

    }
}