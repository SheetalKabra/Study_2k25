package org.example.LeetCode;

import java.util.Map;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        System.out.println(maxArea(new int[]{1,1}));
    }

    public static int maxArea(int[] height){
       int N = height.length;
       int l=0;
       int r=N-1;
       int ans = Integer.MIN_VALUE;
       while(l<r){
           if(height[l] >= height[r]){
               ans = Math.max(ans, height[r]*(r-l));
               r--;
           }else{
               ans = Math.max(ans, height[l]*(r-l));
               l++;
           }
       }
       return ans;
    }
}
