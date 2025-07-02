package org.example.Arrays;

public class MaxSubarraySum {
    public static void main(String[] args) {
        System.out.println(maxSubarraySum(new int[] {-3,4,-2,5,3,-2,8,2,-1,4}, 5));
    }

    public static int maxSubarraySum(int[] arr, int k){
        int N = arr.length;
        int s = 0;
        int e = k-1;
        int sum = 0;
        int ans = Integer.MIN_VALUE;

        for(int i=s; i<=e;i++){
            sum += arr[i];
        }
        while(e<N-1){
            sum -= arr[s];
            s++;
            e++;
            sum += arr[e];
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
