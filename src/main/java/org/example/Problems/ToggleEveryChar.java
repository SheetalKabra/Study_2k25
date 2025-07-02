package org.example.Problems;

public class ToggleEveryChar {
    public static void main(String[] args) {
        System.out.println(toggleEveryChar(new char[] {'S','a','l','E','s'}));
    }

    public static char[] toggleEveryChar(char[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i] ^= 32;
        }
        return arr;
    }
}
