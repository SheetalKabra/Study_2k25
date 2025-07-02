package org.example.Problems;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindromicSubstring("abacab"));
        System.out.println(longestPalindromicSubstring("madam"));
        System.out.println(longestPalindromicSubstring("abaaba"));
    }

    public static int longestPalindromicSubstring(String str){
        int N = str.length();
        int ans = Integer.MIN_VALUE;
        //for odd:
        for(int i=0; i<N; i++){
            int l = i-1;
            int r = i+1;
            int length = 1;
            while(l >= 0 && r <= N-1){
                if(str.charAt(l) == str.charAt(r)){
                    length += 2;
                }
                l--;
                r++;
            }
            ans = Math.max(ans, length);
        }

        //for even:
        for(int i=0; i<N; i++){
            int l = i;
            int r = i+1;
            int length = 0;
            while(l >= 0 && r <= N-1){
                if(str.charAt(l) == str.charAt(r)){
                    length += 2;
                }
                l--;
                r++;
            }
            ans = Math.max(ans, length);
        }
        return ans;
    }
}
