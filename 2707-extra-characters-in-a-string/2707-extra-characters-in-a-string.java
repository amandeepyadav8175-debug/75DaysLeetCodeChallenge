class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        int dp[]= new int[50];// given in constrains
        Arrays.fill(dp,-1);
        HashSet<String> dicset=new HashSet<>(Arrays.asList(dictionary));
        return recur(s,dicset,0,dp);
        
    }
    public int recur(String s,HashSet<String>dictionary,int indx,int[]dp){
        if(indx==s.length()) return 0;// means empty string
        if(dp[indx]!=-1) return dp[indx];

        int minextrachar=Integer.MAX_VALUE;
        StringBuilder sb= new StringBuilder();
        for(int i=indx;i<s.length();i++){
            sb.append(s.charAt(i));//l
            int extrachar=0;
            if(!dictionary.contains(sb.toString())){
                extrachar=sb.length();
            }
           int currchar=recur(s,dictionary,i+1,dp);
            minextrachar=Math.min(minextrachar,extrachar+currchar);
        }
            return dp[indx]= minextrachar;

        

    }
}