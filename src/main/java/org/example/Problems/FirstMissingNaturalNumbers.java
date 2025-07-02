package org.example.Problems;

import java.util.Arrays;
import java.util.Map;

public class FirstMissingNaturalNumbers {
    public static void main(String[] args) {
//        System.out.println(firstMissinNaturalNumber(new int[] {3,-2,1,2,7}));
//        System.out.println(firstMissinNaturalNumber(new int[] {1,2,5,4,6,3}));
        System.out.println(firstMissinNaturalNumber(new int[] {1,2,5,4,7,3}));
        System.out.println(firstMissinNaturalNumber(new int[] {13,12,10,7,8,3}));
    }

    public static int firstMissinNaturalNumber(int[] array){
        int N = array.length;
        //replace unused numbers of array with N+2
        //unused numbers are
           // 1. which are less than 1
          //  2. which are greater than N
        for(int i=0; i<N; i++){
            if(array[i] < 1 || array[i] > N){
                array[i] = N+2;
            }
        }
        System.out.println(Arrays.toString(array));
        //now add - sign before the number like you seen it
        for(int i=0; i<N; i++){
            if(Math.abs(array[i]) != N+2){
                int val = Math.abs(array[i]);
                array[val-1] = -array[val-1];
            }
        }
        System.out.println(Arrays.toString(array));
        for(int i=0; i<N; i++){
            if(array[i] > 0){
                return i+1;
            }
        }
        return N+1;
    }
}
