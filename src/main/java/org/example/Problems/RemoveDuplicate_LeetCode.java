package org.example.Problems;

import java.util.Arrays;

public class RemoveDuplicate_LeetCode {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] {1,1,2}));
        System.out.println(removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));
    }

    public static int removeDuplicates(int[] nums) {
        int N = nums.length;
        int l = 0;
        int r = 0;
        while(r<N){
            if(nums[l] == nums[r]){
                r++;
            }else{
                l++;
                nums[l] = nums[r];
            }
        }
        System.out.println("nums:"+ Arrays.toString(nums));
        return l+1;
    }
}
