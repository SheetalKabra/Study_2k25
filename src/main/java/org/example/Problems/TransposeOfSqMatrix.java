package org.example.Problems;

import org.example.Util.TransposeOfSqMat;

import java.util.Arrays;

public class TransposeOfSqMatrix {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(TransposeOfSqMat.transposeSqMat(new int[][] {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        })));
    }


}
