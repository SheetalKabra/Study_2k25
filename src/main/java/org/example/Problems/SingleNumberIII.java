package org.example.Problems;

import java.util.Arrays;

public class SingleNumberIII {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSingleNumber(new int[]{1, 2, 3, 1, 2, 4})));
//        System.out.println(Arrays.toString(getSingleNumber(new int[]{1, 5, 3, 1, 5, 4})));
//        System.out.println(Arrays.toString(getSingleNumber(new int[]{1, 5, 3, 1, 5, 4, 3, 7})));
    }

    public static int[] getSingleNumber(int[] arr){
        int N = arr.length;
        int ans = 0;
        //1. Do XOR of all elements
        for(int element: arr){
            ans ^= element;
        }
        //2. Find out any set bits
        int setBitIndex = -1;
        for(int i=0; i<32;  i++){
            if(checkSetBit(ans, i)){
                setBitIndex = i;
                break;
            }
        }

        //create 2 groups,
        //1st group will contain all elements having ith bit set
        //2nd group will contain all elements having ith bit not set
        int g1 = 0;
        int g2 = 0;
        for(int i=0; i<N; i++){
            if(checkSetBit(arr[i], setBitIndex)){
                g1 ^= arr[i];
            }else{
                g2 ^= arr[i];
            }
        }
        return new int[] {g1, g2};
    }

    private static boolean checkSetBit(int N, int i){
        return (N & (1<<i)) !=0;
    }
}
