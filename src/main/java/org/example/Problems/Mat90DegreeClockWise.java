package org.example.Problems;

import org.example.Util.TransposeOfSqMat;

import java.util.Arrays;

public class Mat90DegreeClockWise {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(rotate90DegreeMatrix(new int[][] {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        })));
    }

    public static int[][] rotate90DegreeMatrix(int[][] mat){
        mat = TransposeOfSqMat.transposeSqMat(mat);
        int N = mat.length;

        for(int i=0; i<N; i++){
            int s = 0;
            int e = N-1;
            while (e>s){
                int temp = mat[i][s];
                mat[i][s] = mat[i][e];
                mat[i][e] = temp;
                e--;
                s++;
            }
        }
        return mat;
    }
}
