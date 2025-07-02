package org.example.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class EvaluatePostfixExpression {
    public static void main(String[] args) {
        System.out.println(evaluatePostfixExpression(new ArrayList<>(Arrays.asList("2", "3", "1", "5", "+", "-", "*"))));
        System.out.println(evaluatePostfixExpression(new ArrayList<>(Arrays.asList("2", "1", "+", "3", "*"))));
        System.out.println(evaluatePostfixExpression(new ArrayList<>(Arrays.asList("4", "13", "5", "/", "+"))));
    }

    public static int evaluatePostfixExpression(ArrayList<String> A){
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<A.size(); i++){
            if(A.get(i).equals("+") ||  A.get(i).equals("-") || A.get(i).equals("*") || A.get(i).equals("/") || A.get(i).equals("^")){
                int b = stack.peek();
                stack.pop();
                int a = stack.peek();
                stack.pop();
                switch (A.get(i)){
                    case "+":
                        stack.push(a+b);
                        break;
                    case "-":
                        stack.push(a-b);
                        break;
                    case "*":
                        stack.push(a*b);
                        break;
                    case "/":
                        stack.push(a/b);
                        break;
                    case "^":
                        stack.push(a^b);
                        break;
                }
            }else{
                stack.push(Integer.parseInt(A.get(i)));
            }
        }
        return stack.peek();
    }
}
