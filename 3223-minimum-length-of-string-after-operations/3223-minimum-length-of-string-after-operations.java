class Solution {
    public int minimumLength(String s) {
        int fre[]= new int[26];
        int n= s.length();
        int count=0;
        for(int i=0;i<n;i++){
            fre[s.charAt(i)-'a']++;

        }
        for(int i=0;i<26;i++){
            if(fre[i]>0){
                if(fre[i]%2==0){
                    count+=2;

                }else{
                    count+=1;
                }
            }
        }
        return count;
        
    }
}