package org.example.Problems;

public class PrintFrom1ToN_Recursion {
    public static void main(String[] args) {
        printNo(10);
    }

    public static void printNo(int N){
        if(N == 0) return;
        printNo(N-1);
        System.out.print(N+" ");
    }
}
