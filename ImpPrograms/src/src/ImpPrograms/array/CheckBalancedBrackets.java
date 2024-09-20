package ImpPrograms.array;

import java.util.Stack;

public class CheckBalancedBrackets {

    public static boolean isBalancedBracket(String str){
        Stack<Character> stack= new Stack<>();
       for(int i=0;i<str.length();i++){
           char c=str.charAt(i);
           if(c=='('){
               stack.push(c);
           }else {
               if(!stack.isEmpty()&& c==')' && stack.peek()=='('){
                   stack.pop();
               }
           }
        }
       if (stack.isEmpty()){
           return true;
       }else return  false;
    }
    public static void main(String[] args) {
        String s="(({}))";
        Boolean b=isBalancedBracket(s);
        System.out.println(b);
    }
}
