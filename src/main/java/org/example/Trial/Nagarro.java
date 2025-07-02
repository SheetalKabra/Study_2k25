package org.example.Trial;

import java.util.Stack;

public class Nagarro {

    public static void main(String[] args) {
        System.out.println("()"+checkBalancedBrackets("()"));
        System.out.println("(())"+checkBalancedBrackets("(())"));
        System.out.println(checkBalancedBrackets("(()"));
        System.out.println(checkBalancedBrackets("())("));
        System.out.println(checkBalancedBrackets("((()))"));
        System.out.println(checkBalancedBrackets("()()"));
        System.out.println(checkBalancedBrackets(")("));
        System.out.println(checkBalancedBrackets("()()(())"));
        System.out.println(checkBalancedBrackets("(()()(("));
    }

    public static boolean checkBalancedBrackets(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push('(');
            }else{
                if(stack.empty()){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }
        return stack.empty();
    }
}
