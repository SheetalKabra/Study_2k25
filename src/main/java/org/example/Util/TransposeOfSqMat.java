package org.example.Util;

public class TransposeOfSqMat {

    public static int[][] transposeSqMat(int[][] mat){
        int N = mat.length;
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        return mat;
    }
}
