package org.example.Problems;

import java.util.Arrays;

public class RemoveDuplicateII {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] {0,0,1,1,1,1,2,2,3,3,4}));
    }

    public static int removeDuplicates(int[] nums){
        int l = 0;
        int r = 0;
        int N = nums.length;
        boolean flag = false;
        while(r<N){
            if(nums[l] == nums[r]){
                r++;
            }else{
                if(flag){
                    l++;
                    nums[l] = nums[r];
                }
                if(nums[l+1] == nums[l] && !flag){
                    l++;
                    flag = true;
                }
            }
        }
        System.out.printf(Arrays.toString(nums));
        return l+1;

    }
}
