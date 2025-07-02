package org.example.Problems;

public class MaxSubarraySum {
    public static void main(String[] args) {
        System.out.println(maxSubarraySum(new int[] {-3,4,-2,5,3,-2,8,2,-1,4}, 5));
    }

    public static int maxSubarraySum(int[] arr, int k){
        int N = arr.length;
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        int e = 0;
        for(int i=0; i<k;i++){
            sum += arr[i];
            e++;
        }
        ans = sum;
        for(int i=1; i<N-k; i++){
            sum -= arr[i-1];
            sum += arr[e];
            e++;
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
