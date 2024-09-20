package ImpPrograms;


import java.util.Stack;

public class CheckBalancedBrackets {

    public static void main(String[] args) {
        String str = "{{([])}}";
        String str2 = "{{}[])}}";
        String expr = "[()]{}{[()()]()}";

        System.out.println("Given string is with balanced brackets " + isBalanced(str));
        System.out.println("Given string is with balanced brackets " + isBalanced(str2));
        System.out.println("Given string is with balanced brackets " + isBalanced(expr));

    }

    private static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for(int i =0; i< str.length();i++){
          char ch = str.charAt(i);

          if(ch == '{' || ch == '(' || ch == '[' ){
                stack.push(ch);

          } else if(ch == '}' || ch == ']' || ch == ')' ){
              if(stack.isEmpty()) return false;

            char top = stack.pop();

            if((top =='{' && ch !='}') || (top =='[' && ch !=']') || (top =='(' && ch !=')')){
                return false;
            }
          }
        }
        return stack.isEmpty();
    }
}
