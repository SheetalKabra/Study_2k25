package org.example.Problems;

public class SetithBit {
    public static void main(String[] args) {
        //given 0 and i, set ith bit
        System.out.println(setithBit(0,1));
        System.out.println(setithBit(25,2));
        System.out.println(setithBit(21,3));
        System.out.println(setithBit(10,4));


    }

    public static int setithBit(int N, int i){
//        return (int) Math.pow(2, i);
        //or
        return (N | (1<<i));
    }
}
