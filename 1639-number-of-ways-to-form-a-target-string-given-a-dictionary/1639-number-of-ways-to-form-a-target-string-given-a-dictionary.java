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

        long next[]= new long[targetlen+1];
        next[targetlen]=1;
        for(int i=wordlen-1;i>=0;i--){
             long curr[]= new long[targetlen+1];
              curr[targetlen]=1;
            for(int j=targetlen-1;j>=0;j--){
                  int indx=target.charAt(j)-'a';
                    int freq= charfreq[i][indx];

        long pick=freq* next[j+1];//recur(wordindx+1,targetindx+1,charfreq,words,target,dp);
        long nopick= next[j];//recur(wordindx+1,targetindx,charfreq,words,target,dp);
        long ans=(pick+nopick)%1000000007;

        curr[j]= ans;
        

            }
            next=curr;
        }
        return  (int)next[0];//recur(0,0,charfreq,words,target,dp);

        
        
    }}
    