package org.example.Problems;

import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        System.out.println(IsBalancedParanthesis("[(){]}"));
        System.out.println(IsBalancedParanthesis("[()]{}"));
        System.out.println(IsBalancedParanthesis("[()]{}()"));
        System.out.println(IsBalancedParanthesis("[()]{}(){]"));
    }

    public static boolean IsBalancedParanthesis(String A){
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<A.length(); i++){
            if(A.charAt(i) == '(' || A.charAt(i) == '[' || A.charAt(i) == '{'){
                stack.push(A.charAt(i));
            }else{
                if(stack.empty()){
                    return false;
                }else{
                    char c = stack.peek();
                    if((A.charAt(i) == ')' && c == '(') || (A.charAt(i) == '}' && c == '{') || (A.charAt(i) == ']' && c == '[')){
                        stack.pop();
                    }else{
                        return false;
                    }
                }
            }
        }
        if(!stack.empty()){
            return false;
        }
        return true;
    }

}
