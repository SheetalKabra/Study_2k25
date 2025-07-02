package org.example.Problems;

import java.security.Principal;
import java.util.Stack;

public class IsParanthesisSeqBalanced {
    public static void main(String[] args) {
        System.out.println(checkIsParanthesisSeqBalanced("()"));
        System.out.println(checkIsParanthesisSeqBalanced("())"));
        System.out.println(checkIsParanthesisSeqBalanced("(())"));
        System.out.println(checkIsParanthesisSeqBalanced(")(())"));
        System.out.println(checkIsParanthesisSeqBalanced(")("));
        System.out.println(checkIsParanthesisSeqBalanced("())("));
    }

    public static boolean checkIsParanthesisSeqBalanced(String A){
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<A.length(); i++){
            if(A.charAt(i) == '('){
                stack.push(A.charAt(i));
            }else if(A.charAt(i) == ')'){
                if(stack.empty()){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }
        if(stack.empty()){
            return true;
        }else{
            return false;
        }

    }
}
