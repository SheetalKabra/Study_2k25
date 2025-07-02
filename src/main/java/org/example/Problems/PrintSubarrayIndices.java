package org.example.Problems;

import java.util.Arrays;

public class PrintSubarrayIndices {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(getSubarrayIndices(new int[] {1,2,3,3,4,5,5,5,1,1,1,1}, 3)));
    }

    public static int[][] getSubarrayIndices(int[] arr, int k){
        int N = arr.length;
        int[][] ans = new int[N-k+1][2];
        int s = 0;
        int e = k-1;
        ans[0] = new int[]{s, e};
        int i=1;
        while(e<N-1){
            s++;
            e++;
            ans[i] = new int[]{s,e};
            i++;
        }
        return ans;
    }
}
