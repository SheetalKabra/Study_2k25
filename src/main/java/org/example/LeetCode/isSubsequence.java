package org.example.LeetCode;

public class isSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
        System.out.println(isSubsequence("abc", "ahgdcb"));
    }

    public static boolean isSubsequence(String s, String t){
        int N = s.length();
        int M = t.length();
        int l=0;
        int r=0;
        while(l<N && r<M){
            if(s.charAt(l) == t.charAt(r)){
                l++;
                r++;
            }else{
                r++;
            }
        }
        return l==N;
    }
}
