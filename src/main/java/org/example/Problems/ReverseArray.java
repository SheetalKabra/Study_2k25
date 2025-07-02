package org.example.Problems;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(reverse(new int[]{1, 2, 3, 4})));
    }

    public static int[] reverse(int[] arr){
        int N = arr.length;
        int s = 0;
        int e = N-1;
        int temp;
        while(e>s){
            temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            e--;
            s++;
        }

        return arr;
    }
}
