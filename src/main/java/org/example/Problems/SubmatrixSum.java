package org.example.Problems;

import java.util.Arrays;

public class SubmatrixSum {
    public static void main(String[] args) {
        submatrixSum();
    }

    public static void submatrixSum(){
        int[][] a = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        int N = a.length;
        int M = a[0].length;
        int[][] pf = new int[N][M];
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(i-1 >= 0 ){
                    pf[i][j] = pf[i-1][j];
                }
                if(j-1 >= 0){
                    pf[i][j] += pf[i][j-1];
                }
                if(i-1 >=0 && j-1 >= 0){
                    pf[i][j] -= pf[i-1][j-1];
                }
                pf[i][j] += a[i][j];
            }
        }
        System.out.println(Arrays.deepToString(pf));
    }
}
