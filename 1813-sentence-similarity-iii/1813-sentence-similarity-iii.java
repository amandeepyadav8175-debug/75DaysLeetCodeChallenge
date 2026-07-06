class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        if(sentence1.length()> sentence2.length()){
            return areSentencesSimilar( sentence2, sentence1);
        }
        String smallerword[] = sentence1.split(" ");
         String largerword[] = sentence2.split(" ");
         int s=0;
         int e1= smallerword.length-1;
         int e2= largerword.length-1;
         while(s<=e1 && smallerword[s].equals( largerword[s]) ){
            s++;
         }
          while(s<=e1 && smallerword[e1].equals( largerword[e2]) ){
            e1--;
            e2--;
         }
         return (s>e1);
        
    }
}