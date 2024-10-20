class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> stack = new Stack<>();
        for(char c:expression.toCharArray()){
            if(c==')'){
                StringBuilder str = new StringBuilder();
                while(stack.peek()!='('){
                    str.append(stack.pop());
                }
                stack.pop();
                char symbol=stack.pop();
                if(symbol=='&'){
                    stack.push(and(str.toString()));
                }
                else if(symbol=='|'){
                    stack.push(or(str.toString()));
                }
                else{
                    stack.push(not(str.toString()));
                }

            }
            else if(c!=','){
                stack.push(c);
            }
        }
        if(stack.peek()=='f')return false;
        return true;
    }
    public char or(String str){
        if(str.contains("t"))return 't';
        return 'f';
        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)=='t')return 't';
        // }
        // return 'f';
    }
    public char and(String str){
        if(str.contains("f"))return 'f';
        return 't';
        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)=='f')return 'f';
        // }
        // return 't';
    }
    public char not(String str){
        if(str.charAt(0)=='f')return 't';
        return 'f';
    }
}
