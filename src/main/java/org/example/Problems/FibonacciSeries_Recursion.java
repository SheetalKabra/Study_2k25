package org.example.Problems;

public class FibonacciSeries_Recursion {
    public static void main(String[] args) {
        int N = 10;
        if(N >= 1) System.out.print(1+ " ");
        if(N >= 2) System.out.print(1+ " ");
        fib(1,1,2,N);
    }

    public static void fib(int a, int b, int index, int N){
        if(index > N){
            return;
        }
        int c = a+b;
        System.out.print(c+" ");
        fib(b, c, index+1, N);
    }
}
