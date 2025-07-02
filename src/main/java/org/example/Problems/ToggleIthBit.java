package org.example.Problems;

public class ToggleIthBit {
    public static void main(String[] args) {
        System.out.println(toggleIthBit(25, 2));
        System.out.println(toggleIthBit(25, 0));
    }

    public static int toggleIthBit(int N, int i){
        return N ^ (1<<i);
    }
}
