package org.example.Problems;

public class PowerFunction_Recursion {
    public static void main(String[] args) {
        System.out.println(powerFn(2, 5));
        System.out.println(powerFn(2, 10));
    }

//    //having TC: O(N)
//    public static int powerFn(int a, int N){
//        if (N == 0) return 1;
//        if (N == 1) return a;
//        return powerFn(a, N-1)*a;
//    }

    //having TC: O(log(N))
    public static int powerFn(int a, int N){
        if (N == 0) return 1;
        if (N == 1) return a;
        int half = powerFn(a, N/2);
        if(N%2 == 0){
            return half*half;
        }else{
            return half*half*a;
        }

    }
}
