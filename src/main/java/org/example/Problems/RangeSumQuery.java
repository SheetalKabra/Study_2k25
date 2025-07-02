package org.example.Problems;

import org.example.Util.GetPrefixSum;

import java.util.Arrays;

public class RangeSumQuery {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rangeSum(new int[]{-3, 6, 2, 4, 5, 2, 8, -9, 3, 1},
                new int[][]{{4, 8}, {3, 7}, {1,3}, {0,4}, {6,9}, {7,7}})));
    }

    public static int[] rangeSum(int[] arr, int[][] queries){
        int N = arr.length;
        int[] prefixSum = GetPrefixSum.find(arr);
        int[] ans = new int[queries.length];
        for(int i=0; i<queries.length;i++){
            int l = queries[i][0];
            int r = queries[i][1];
            if(l==0){
                ans[i] = prefixSum[r];
            }else{
                ans[i] = prefixSum[r] - prefixSum[l-1];
            }
        }
        return ans;
    }
}
