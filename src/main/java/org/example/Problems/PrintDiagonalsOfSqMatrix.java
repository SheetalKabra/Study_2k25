package org.example.Problems;

public class PrintDiagonalsOfSqMatrix {
    public static void main(String[] args) {
        printDiagonals(new int[][] {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        });
    }

    public static void printDiagonals(int[][] mat){
        int N = mat.length;
        for(int i=0; i<N; i++){
            System.out.print(mat[i][i]+",");
        }
        System.out.println("");
        for(int i=0; i<N; i++){
            int j = N-1-i;
            System.out.print(mat[i][j]+",");
        }
    }
}
