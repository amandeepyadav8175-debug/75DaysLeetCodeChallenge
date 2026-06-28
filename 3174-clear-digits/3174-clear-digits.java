class Solution {
    public String clearDigits(String s) {
        StringBuilder sb= new StringBuilder();
        for(char ch : s.toCharArray()){
            if(!Character.isDigit(ch)){
                sb.append(ch);
            } else{
                if(sb.length()!=0){
                   // st.pop();
                   sb.deleteCharAt(sb.length()-1);
                }
            }
            
        }
       
        return sb.toString();
        
    }
}