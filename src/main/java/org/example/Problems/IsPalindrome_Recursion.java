package org.example.Problems;

public class IsPalindrome_Recursion {
    public static void main(String[] args) {
        System.out.println(isPalin("MADAM", 0, 4));
        System.out.println(isPalin("MALAYALAM", 0, 4));
    }

    public static boolean isPalin(String str, int s, int e){
        if(s>e) return true;
        if(str.charAt(s) == str.charAt(e)){
            return isPalin(str, s+1, e-1);
        }else{
            return false;
        }
    }
}
