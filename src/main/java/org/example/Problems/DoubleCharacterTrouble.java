package org.example.Problems;

import java.util.Stack;

public class DoubleCharacterTrouble {
    public static void main(String[] args) {
        System.out.println(doubleCharTrouble("abbd"));
        System.out.println(doubleCharTrouble("abccbd"));
        System.out.println(doubleCharTrouble("abcddcba"));
    }

    public static String doubleCharTrouble(String A){
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<A.length(); i++){
            if(!stack.empty() && stack.peek() == A.charAt(i)){
                stack.pop();
            }else{
                stack.push(A.charAt(i));
            }

        }
        return stack.toString();
    }
}
