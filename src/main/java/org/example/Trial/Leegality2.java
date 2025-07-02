package org.example.Trial;

import java.util.Arrays;

public class Leegality2 {
    public static void main(String[] args) {
        System.out.println(longestSubstring("abcabcbb"));
        System.out.println(longestSubstring("abcabcbacd"));
        System.out.println(longestSubstring("abcdef"));
        System.out.println(longestSubstring("aaaaa"));
    }

    public static int longestSubstring(String s){
        int[] charArr = new int[26];
        int l=0;
        int r = 0;
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            int c = s.charAt(i);
            if(charArr[c-97] == 1){
                int lValue = s.charAt(l);
                while(s.charAt(l) != s.charAt(i) && l<=i){
                    lValue = s.charAt(l);
                    charArr[lValue-97] = 0;
                    l++;
                }
                charArr[lValue-97] = 0;
                l++;


            }
            charArr[c-97] = 1;
//            System.out.println(Arrays.toString(charArr));

            ans = Math.max(ans, i-l+1);
//            System.out.println(ans);
        }
        return ans;
    }
}
