package org.example.Problems;

public class CountSetBits {
    public static void main(String[] args) {
        System.out.println(countSetBits(21));
        System.out.println(countSetBits(0));
        System.out.println(countSetBits(1));
        System.out.println(countSetBits(16));
        System.out.println(countSetBits(15));
    }

    public static int countSetBits(int N){
        int count = 0;
        for(int i=0; i<32; i++){
            if((N & (1<<i)) != 0){
                count++;
            }
        }
        return count;
    }
}
