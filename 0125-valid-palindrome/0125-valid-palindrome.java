class Solution {
    public boolean isPalindrome(String s) {
      int lp=0;
      int rp=s.length()-1;
      while(lp<rp){
        char lpchar= s.charAt(lp);
        char rpchar=s.charAt(rp);
      
      if(!Character.isLetterOrDigit(lpchar)){
         lp++;
         continue;// skip the non alphanumeic
      }
       if(!Character.isLetterOrDigit(rpchar)){
         rp--;
         continue;// skip
         }
       if(Character.toLowerCase(lpchar) != Character.toLowerCase(rpchar)){
        return false;
       }else{
        lp++;
        rp--;
       }}

       return true;
      

       

        
    }
}
// non alphanumeic
/* @  #  $  %  ^  &  *  (  )
!  ?  ,  .  :  ;  '  "
(space)  \  /  -  _  */