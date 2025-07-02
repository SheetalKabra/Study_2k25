package org.example.Problems;

public class NthFibonacciNumber_Recursion {
    public static void main(String[] args) {
        NthFibonacciNumber_Recursion obj = new NthFibonacciNumber_Recursion();
        System.out.println(obj.NthFibonacciNo(5));
        System.out.println(obj.NthFibonacciNo(2));
        System.out.println(obj.NthFibonacciNo(3));
    }

    public int NthFibonacciNo(int N){
        if(N == 0){
            return 0;
        }
        if(N == 2 || N == 1){
            return 1;
        }
        return NthFibonacciNo(N-1) + NthFibonacciNo(N-2);
    }
}
