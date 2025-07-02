package org.example.Trial;

import java.util.Stack;

public class Wrkspot {
    public static void main(String[] args) {
        //Input: pushed = [1, 2, 3, 4, 5], popped = [4, 5, 3, 2, 1]
        //Output: true
        //Explanation: Push 1, 2, 3, 4; pop 4; push 5; pop 5, 3, 2, 1.
        //
        //Input: pushed = [1, 2, 3, 4, 5], popped = [4, 3, 5, 1, 2]
        //Output: false
        //Explanation: Cannot pop 1 before 2.
//        System.out.println(isValidStack(new int[]{1,2,3,4,5}, new int[]{4,5,3,2,1}));
        System.out.println(isValidStack(new int[]{1,2,3,4,5}, new int[]{4, 3, 5, 1, 2}));
//        System.out.println(isValidStack(new int[]{1,2,3,4,5}, new int[]{6,7,8,9,10}));
//        System.out.println(isValidStack(new int[]{1,2,3,4,5}, new int[]{5,4}));
    }
    public static boolean isValidStack(int[] pushed, int[] popped){
        Stack<Integer> stack = new Stack<>();
        int j=0;
        int i=0;
        for(i=0; i<popped.length; i++){
            if(!stack.empty() && stack.peek() == popped[i]){
                stack.pop();
                System.out.println("i:");
//                if(i==popped.length-1){
//                    return true;
//                }
            }else if(j<pushed.length && pushed[j] == popped[i]){
                j++;
            }else{
                while(j< pushed.length && pushed[j] != popped[i]){
                    stack.push(pushed[j]);
                    j++;
                }
                j++;
            }
        }
        System.out.println("i:"+i);
        if((stack.empty())){
            return true;
        }
        return false;
    }


}
