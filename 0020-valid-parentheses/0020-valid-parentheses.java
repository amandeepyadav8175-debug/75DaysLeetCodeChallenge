class Solution {
    public boolean isValid(String s) {
        int n= s.length();
        Stack<Character> stack = new Stack<>();
       for(char ch : s.toCharArray()) {
          if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else{
                if(stack.isEmpty()) return false;// means closing brackets > opening brack ()}
                if(stack.peek()== '(' && ch== ')'||
                stack.peek()== '{' && ch== '}'||
                stack.peek()== '[' && ch== ']'){// peack=top
                  stack.pop(); 
                } else{// no matches
                    return false;

                }
            } }
            return  stack.isEmpty();// return true if empty // it is case when
                                     //  means closing brackets < opening brack ({}
    }
}
// stack is lifo concept  last opening breacket(any type)=> first closing bracke(any type)