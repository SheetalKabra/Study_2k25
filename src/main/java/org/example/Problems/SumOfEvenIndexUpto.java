package org.example.Problems;

import java.util.Arrays;

public class SumOfEvenIndexUpto {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumOfEvenIndex(new int[] {1,2,3,4,5})));
    }

    public static int[] sumOfEvenIndex(int[] arr){
        int N = arr.length;
        int[] pe = new int[N];
        pe[0] = arr[0];
        for(int i=1; i<N; i++){
            if(i%2 == 0){
                pe[i] = pe[i-1] + arr[i];
            }else{
                pe[i] = pe[i-1];
            }
        }
        return pe;
    }
}
