package DSA.Stack;

import java.util.Stack;

public class Evaluate_Expression {
    public static void main(String[] args) {
        String[] expression = {};
        Stack<String> stack = new Stack<>();
        for(String str: expression){
            if(str == "+" || str == "-" || str == "*" || str == "/"){
                int num2 = Integer.parseInt(stack.pop());
                int num1 = Integer.parseInt(stack.pop());
                int result = num1;
            }else{
                stack.push(str);
            }
        }
    }
}
