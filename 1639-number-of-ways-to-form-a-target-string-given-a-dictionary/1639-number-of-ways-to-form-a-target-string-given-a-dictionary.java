class Solution {
    public int numWays(String[] words, String target) {
        int wordlen=words[0].length();
        int targetlen=target.length();
        int charfreq[][]= new int[wordlen][26];
          for(String word:words){
            for(int i=0;i<wordlen;i++){
                int currindx=word.charAt(i)-'a';
                charfreq[i][currindx]++;
            }
        }

        long dp[][]= new long[ wordlen+1][targetlen+1];
        for(int i=0;i<wordlen+1;i++){
           dp[i][targetlen]=1;
        }
        for(int i=wordlen-1;i>=0;i--){
            for(int j=targetlen-1;j>=0;j--){
                  int indx=target.charAt(j)-'a';
                    int freq= charfreq[i][indx];

        long pick=freq* dp[i+1][j+1];//recur(wordindx+1,targetindx+1,charfreq,words,target,dp);
        long nopick= dp[i+1][j];//recur(wordindx+1,targetindx,charfreq,words,target,dp);
        long ans=(pick+nopick)%1000000007;

        dp[i][j]= ans;
        

            }
        }
        return  (int)dp[0][0];//recur(0,0,charfreq,words,target,dp);

        
        
    }}
    