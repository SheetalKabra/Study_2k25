package org.example.Problems;

public class SumOfNNaturalNo_Recursion {
    public static void main(String[] args) {
        SumOfNNaturalNo_Recursion obj = new SumOfNNaturalNo_Recursion();
        System.out.println(obj.sum(5));
        System.out.println(obj.sum(1));
        System.out.println(obj.sum(0));
    }

    public int sum(int N){
        if(N == 0){
            return 0;
        }
        if(N == 1){
            return 1;
        }
        return sum(N-1) + N;
    }
}
