package org.example.Problems;

import java.util.Arrays;

public class RowAndColWiseSum {
    public static void main(String[] args) {
        int[][] mat =  {
            {1,2,3,4,5},
            {7,8,9,10,11},
            {12,13,14,15,16},
            {17,18,19,20,21}
        };
        System.out.println(Arrays.toString(rowWiseSum(mat)));
        System.out.println(Arrays.toString(colWiseSum(mat)));
    }

    public static int[] rowWiseSum(int[][] mat){
        int N = mat.length;
        int M = mat[0].length;
        int[] ans = new int[N];
        for(int i=0; i<N; i++){
            int sum = 0;
            for(int j=0; j<M; j++){
                sum += mat[i][j];
            }
            ans[i] = sum;
        }
        return ans;
    }

    public static int[] colWiseSum(int[][] mat){
        int N = mat.length;
        int M = mat[0].length;
        int[] ans = new int[M];
        for(int i=0; i<M; i++){
            int sum = 0;
            for(int j=0; j<N; j++){
                sum += mat[j][i];
            }
            ans[i] = sum;
        }
        return ans;
    }
}
