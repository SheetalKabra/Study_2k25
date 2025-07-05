package org.example.LeetCode;

public class MinimmumSizeSubarraySum {
    public static void main(String[] args) {
        System.out.println(minSizeSubarraySum(7, new int[]{2,3,1,2,4,3}));
        System.out.println(minSizeSubarraySum(4, new int[]{1,4,4}));
        System.out.println(minSizeSubarraySum(11, new int[]{1,1,1,1,1,1,1,1}));
    }

    public static int minSizeSubarraySum(int target, int[] nums){
        int N = nums.length;
        int sum = 0;
        int s = 0;
        int e = -1;
        int ans =Integer.MAX_VALUE;
        while(e<N){
            if(sum < target){
                e++;
                if(e>=N){
                    break;
                }
                sum += nums[e];
            }else{
                ans = Math.min(ans, e-s+1);
                sum -= nums[s];
                s++;
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;

    }
}
