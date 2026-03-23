class Solution {
    public int numWays(String[] words, String target) {
        int wordlen=words[0].length();
        int targetlen=target.length();
        int charfreq[][]= new int[wordlen][26];
        long dp[][]= new long[ wordlen+1][targetlen+1];
        for(int i=0;i<wordlen+1;i++){
            Arrays.fill(dp[i],-1);
        }
        for(String word:words){
            for(int i=0;i<wordlen;i++){
                int currindx=word.charAt(i)-'a';
                charfreq[i][currindx]++;
            }
        }
        return  (int)recur(0,0,charfreq,words,target,dp);

        
        
    }
     public long recur( int wordindx,int targetindx,int charfreq[][],String[] words, String target,long[][] dp) {
        if(targetindx==target.length()) return 1; // solution find
             
        if(wordindx==words[0].length()) return 0;
        if(target.length()-targetindx > words[0].length()-wordindx)  return 0;
        if(dp[wordindx][targetindx]!= -1) return dp[wordindx][targetindx];

        int indx=target.charAt(targetindx)-'a';
        int freq= charfreq[wordindx][indx];

        long pick=freq*recur(wordindx+1,targetindx+1,charfreq,words,target,dp);
        long nopick= recur(wordindx+1,targetindx,charfreq,words,target,dp);
        long ans=(pick+nopick)%1000000007;

        dp[wordindx][targetindx]= ans;
        return ans;

}}