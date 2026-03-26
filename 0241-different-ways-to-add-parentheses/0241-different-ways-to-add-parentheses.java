class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        
        int n=  expression.length();
        return recur( expression, 0,n-1);
        
    }
     public List<Integer> recur(String expression,int start,int end){
         List<Integer> res= new ArrayList<>();

        if(start==end){// means only single digit [5]
        int num=expression.charAt(start)-'0'; //convert string to int
        res.add(num);
        return res;

        }
        if(end-start==1 && Character.isDigit(expression.charAt(start))){// means two elemnt
         int num=Integer.parseInt( expression.substring(start,end+1));
           res.add(num);
        return res;
        }
        // split
        for(int i=start;i<=end;i++){
            if( Character.isDigit(expression.charAt(i))) continue;
            List<Integer> left= recur(expression,start,i-1);
            List<Integer> right= recur(expression,i+1,end);
            int op=expression.charAt(i);

            for(int l: left){
                for(int r:right){
                    if(op=='*'){
                        res.add(l*r);
                    }else if(op=='+'){
                        res.add(l+r);

                    }else{
                        res.add(l-r);
                    }
                }
            }
        }
        return res;

     }

}