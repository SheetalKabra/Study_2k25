package org.example.Problems;

import java.util.Arrays;

public class RotateArrayByKTimes {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateArray(new int[]{1, 2, 3, 4, 5}, 0)));
        System.out.println(Arrays.toString(rotateArray(new int[]{1, 2, 3, 4, 5}, 1)));
        System.out.println(Arrays.toString(rotateArray(new int[]{1, 2, 3, 4, 5}, 2)));
        System.out.println(Arrays.toString(rotateArray(new int[]{1, 2, 3, 4, 5}, 3)));
        System.out.println(Arrays.toString(rotateArray(new int[]{1, 2, 3, 4, 5}, 4)));
        System.out.println(Arrays.toString(rotateArray(new int[]{1, 2, 3, 4, 5}, 5)));
    }

    public static int[] rotateArray(int[] arr, int k){
        int N = arr.length;
        k = k%N;
        if(k ==0){
            return arr;
        }
        int[] newArr = new int[N];
        for(int i=0; i<N; i++){
            newArr[(i+k)%N] = arr[i];
        }
        return newArr;
    }
}
