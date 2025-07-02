package org.example.LeetCode;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100,4,200,3,2,1}));
    }

    public static int longestConsecutive(int[] nums){
        //100, 4, 200, 3, 2, 1
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);

        }

        int ans = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i]-1)){
                continue;
            }else{
                int count = 0;
                int x = nums[i];
                while(set.contains(x)){
                    count++;
                    x++;
                    System.out.println("in while:"+count+", x:"+x);
                }
                System.out.println("here:"+count);
                ans = Math.max(ans, count);
            }
        }
        return ans;

    }
}
