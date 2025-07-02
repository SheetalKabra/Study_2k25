package org.example.Trial;

import java.util.Arrays;
import java.util.Stack;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }

    public static String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(st.empty()){
                st.push(s.charAt(i));
            }else{
                if(st.peek() == s.charAt(i)){
                    st.pop();
                }else{
                    st.push(s.charAt(i));
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<st.size(); i++){
            stringBuilder.append(st.get(i));
        }
        return stringBuilder.toString();
    }

}
