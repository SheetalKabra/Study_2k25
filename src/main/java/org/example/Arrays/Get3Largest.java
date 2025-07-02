package org.example.Arrays;

import java.util.Arrays;

public class Get3Largest {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getThreeLargest(new int[]{10, 4, 3, 50, 23, 90})));
        System.out.println(Arrays.toString(getThreeLargest(new int[]{12, 13, 1, 10, 34, 1})));
        System.out.println(Arrays.toString(getThreeLargest(new int[]{10, 9, 9})));
        System.out.println(Arrays.toString(getThreeLargest(new int[]{10, 10, 10})));
        System.out.println(Arrays.toString(getThreeLargest(new int[]{})));
    }

    public static int[] getThreeLargest(int[] array){
        int n = array.length;
        if(n <= 1){
            return array;
        }
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(array[i] > max){
                thirdMax = secMax;
                secMax = max;
                max = array[i];
            } else if(array[i] > secMax) {
                thirdMax = secMax;
                secMax = array[i];
            } else if(array[i] > thirdMax){
                thirdMax = array[i];
            }
        }

        if(max != secMax){
            return thirdMax == secMax ? new int[] {max, secMax} : new int[] {max, secMax, thirdMax};
        }else{
            return new int[] {max};
        }

    }
}
