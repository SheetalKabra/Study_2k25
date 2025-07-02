package org.example.Problems;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallesElement {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(nearestSmallestElement(new int[] {4, 5, 2, 10, 3, 2})));
        System.out.println(Arrays.toString(nearestSmallestElement(new int[] {4, 6, 10, 11, 7, 8, 3, 5})));
    }

    public static int[] nearestSmallestElement(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            while(!stack.empty() && stack.peek() >= arr[i]){
                stack.pop();
            }
            if(stack.empty()){
                ans[i] = -1;
            }else{
                ans[i] = stack.peek();

            }
            stack.push(arr[i]);
        }
        return ans;
    }
}
