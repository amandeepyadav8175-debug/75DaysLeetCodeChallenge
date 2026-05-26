class Solution {
    public int countSeniors(String[] details) {
        int count=0;
         for(String d: details){
            String age= d.substring(11,13);
            int ageval= Integer.parseInt(age);

            if(ageval>60){
                count++;

            }
         }
         return count;
        
    }
}