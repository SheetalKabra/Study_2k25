package org.example.LeetCode;

public class IndexOfFirstOccurenceInAString {
    public static void main(String[] args) {
//        System.out.println(strStr("aaa", "aaaa"));
        System.out.println(strStr("mississippi", "issipi"));
//        System.out.println(strStr("sabbtsud", "sad"));
//        System.out.println(strStr("sabbtsad", "sad"));
//        System.out.println(strStr("leetcode", "leeto"));
    }

    public static int strStr(String hayStack, String needle){
        int N = hayStack.length();
        int M = needle.length();
        if(M>N){
            return -1;
        }
        int k;
        for(int i=0; i<N-M+1; i++){
            k = i;
            for(int j=0; j<M; j++){
                if(hayStack.charAt(k) == needle.charAt(j)){
                    k++;
                }else{
                    break;
                }
                if(j==M-1){
                    return i;
                }
            }
        }
        return -1;
    }
}
