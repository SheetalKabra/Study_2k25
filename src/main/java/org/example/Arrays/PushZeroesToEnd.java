package org.example.Arrays;

import java.util.Arrays;

public class PushZeroesToEnd {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(pushZeroesToEnd(new int[] {1,2,0,4,3,0,5,0})));
        System.out.println(Arrays.toString(pushZeroesToEnd(new int[] {1,2,6,4,3,0,5,0})));
        System.out.println(Arrays.toString(pushZeroesToEnd(new int[] {1,2,0,4,3,0,5,8})));
        System.out.println(Arrays.toString(pushZeroesToEnd(new int[] {1,2,0,4,3,9,5,1})));
        System.out.println(Arrays.toString(pushZeroesToEnd(new int[] {1,2,8,4,3,9,5,1})));
        System.out.println(Arrays.toString(pushZeroesToEnd(new int[] {0,0,0})));
    }

    public static int[] pushZeroesToEnd(int[] arr){
        int n = arr.length;
        int zeroCount = 0;
        //count no of zeroes;
        for(int i=0; i<n; i++){
            if(arr[i] == 0)
                zeroCount++;
        }
        //no change in array as there are no 0s, or
        //no change in array as there are all 0s
        if(zeroCount == 0 || zeroCount == n)
            return arr;

        int lastZeroIndex = -1;
        int i=0;
        while(i<n){
//            System.out.println("at i="+i+", value:"+arr[i]);
            if(arr[i] == 0 && lastZeroIndex == -1){
                lastZeroIndex = i;
            }else if(lastZeroIndex != -1 && arr[i] != 0){
//                System.out.println("Swap "+arr[lastZeroIndex]+" with "+arr[i]);
                arr[lastZeroIndex] = arr[i];
                arr[i] = 0;
                i=lastZeroIndex+1;
                lastZeroIndex = -1;

                continue;
            }
//            System.out.println("at i="+i+", "+Arrays.toString(arr)+", lastZeroIndex:"+lastZeroIndex);
            i++;
        }

        return arr;
    }
}
