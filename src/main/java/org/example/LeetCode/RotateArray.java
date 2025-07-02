package org.example.LeetCode;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        rotate(new int[]{1,2,3,4,5,6,7}, 0);
        rotate(new int[]{1,2,3,4,5,6,7}, 1);
        rotate(new int[]{1,2,3,4,5,6,7}, 2);
        rotate(new int[]{1,2,3,4,5,6,7}, 3);
        rotate(new int[]{1,2,3,4,5,6,7}, 4);
        rotate(new int[]{1,2,3,4,5,6,7}, 5);
        rotate(new int[]{1,2,3,4,5,6,7}, 6);
        rotate(new int[]{1,2,3,4,5,6,7}, 7);
        rotate(new int[]{1,2,3,4,5,6,7}, 8);
        rotate(new int[]{1,2,3,4,5,6,7}, 9);
        rotate(new int[]{1,2,3,4,5,6,7}, 10);
    }

    public static void rotate(int[] nums, int k){
        int N = nums.length;
        k = k%N;
        int[] ans = new int[N];
        for(int i=0; i<N; i++){
            ans[(i+k)%N] = nums[i];
        }
        for(int i=0; i<N; i++){
            nums[i] = ans[i];
        }
        System.out.println("nums:" + Arrays.toString(nums));
    }
}
