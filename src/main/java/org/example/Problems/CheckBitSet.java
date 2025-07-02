package org.example.Problems;

public class CheckBitSet {
    public static void main(String[] args) {
        System.out.println(checkBitSet(21, 1));
        System.out.println(checkBitSet(21, 0));
        System.out.println(checkBitSet(21, 2));
    }

    public static boolean checkBitSet(int N, int i){
        return (N & (1 << i)) != 0;
    }
}
