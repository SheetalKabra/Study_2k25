package org.example.Problems;

import java.util.Stack;

public class ReverseParanthesisToMakeBalancedString {
    public static void main(String[] args) {
        System.out.println(reverseParanthesisToMakeStringBalanced("((()"));
        System.out.println(reverseParanthesisToMakeStringBalanced(")(()"));
        System.out.println(reverseParanthesisToMakeStringBalanced("(()))())"));
    }

    public static int reverseParanthesisToMakeStringBalanced(String A){
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(int i=0; i<A.length(); i++){
            if(A.charAt(i) == '('){
                stack.push(A.charAt(i));
            }else{
                if(stack.empty() && A.charAt(i) == ')'){
                    count++;
                    stack.push('(');
                }else{
                    stack.pop();
                }
            }
        }
        count += stack.size()/2;
        return count;

    }
}
