package org.example.Problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class InfixToPostfix {
    static Map<Character, Integer> precedenceMap = new HashMap<>();
    public static void main(String[] args) {
        System.out.println(infixToPostfix("A+B*C+D"));
        System.out.println(infixToPostfix("A+B^C*D"));
    }

    public static String infixToPostfix(String A){
        setPrecedence();
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<A.length(); i++){
            if(A.charAt(i) >= 65 && A.charAt(i) <= 90){
                sb.append(A.charAt(i));
            }else{
                while(!stack.empty() && precedenceMap.get(stack.peek()) >= precedenceMap.get(A.charAt(i))){
                    sb.append(stack.peek());
                    stack.pop();
                }
                if(stack.empty()){
                    stack.push(A.charAt(i));
                }else if(precedenceMap.get(stack.peek()) < precedenceMap.get(A.charAt(i))){
                    stack.push(A.charAt(i));
                }
            }
        }
        while(!stack.empty()){
            sb.append(stack.peek());
            stack.pop();
        }
        return sb.toString();
    }

    public static void setPrecedence(){
        precedenceMap.put('-', 1);
        precedenceMap.put('+', 1);
        precedenceMap.put('*', 2);
        precedenceMap.put('/', 2);
        precedenceMap.put('^', 3);
    }
}
