package org.example.Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class CountSubarraysWithOR {
    public static void main(String[] args) {
        System.out.println(countSubarrays(new int[] {1,0,0,1,0,0,1,1,1,0}));
        System.out.println(countSubarrays(new int[] {1,0,0,0,1,0,0,1,1,0}));
        System.out.println(countSubarrays(new int[] {1,0,0,0,1,0,0,1,1,1}));
    }

    public static int countSubarrays(int[] arr){
        int N = arr.length;
        int count = 0;
        int i=0;
        int zerosCount=0;
        while(i<N){
            if(arr[i] == 0){
                zerosCount++;
            }else{
                count += (zerosCount * (zerosCount+1))/2;
                zerosCount = 0;
            }
            i++;
        }
        if(zerosCount != 0){
            count += (zerosCount * (zerosCount+1))/2;
        }
        return count;

    }
}
