package org.example.Problems;

public class Factorial_Recursion {
    public static void main(String[] args) {
        Factorial_Recursion obj = new Factorial_Recursion();
        System.out.println(obj.fact(5));
    }

    public int fact(int N){
        if(N <= 1){
            return 1;
        }
        return fact(N-1)*N;
    }
}
