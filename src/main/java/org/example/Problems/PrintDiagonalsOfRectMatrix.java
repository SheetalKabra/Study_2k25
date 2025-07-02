package org.example.Problems;

public class PrintDiagonalsOfRectMatrix {
    public static void main(String[] args) {
        printDiagonals(new int[][] {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20}
        });
    }

    public static void printDiagonals(int[][] mat){
        int N = mat.length;
        int M = mat[0].length;
        for(int i=0; i<N+M-1; i++){
            for(int j=0; j<=i; j++){
                if(i-j >= N || j >= M){
                    continue;
                }
                System.out.print(mat[i-j][j]+",");
            }
            System.out.println("");
        }
    }
}
