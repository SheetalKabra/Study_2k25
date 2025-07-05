package org.example.LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatinChars {
    public static void main(String[] args) {
        System.out.println(longestSubstringUsingMap("aab"));
        System.out.println(longestSubstringUsingMap("au"));
        System.out.println(longestSubstringUsingMap(" "));
        System.out.println(longestSubstringUsingMap("abcabcaa"));
        System.out.println(longestSubstringUsingMap("abccsbaababa"));
        System.out.println(longestSubstringUsingMap("bbbbbbbb"));
        System.out.println(longestSubstringUsingMap("pwwkew"));
    }

    public static int longestSubstringUsingMap(String str){
        int N = str.length();
        if(N == 0){
            return 0;
        }
        int s = 0;
        int e = 0;
        int len = Integer.MIN_VALUE;

        Map<Character, Integer> map = new HashMap<>();
        while(e<N){
            if(!map.containsKey(str.charAt(e))){
                map.put(str.charAt(e), 1);
                e++;
            }else{
                len = Math.max(len,  e-s);
                while(str.charAt(s) != str.charAt(e)){
                    map.remove(str.charAt(s));
                    s++;
                }
                map.remove(str.charAt(s));
                s++;
            }
            len = Math.max(len,  e-s);
        }
        return len == Integer.MIN_VALUE ? e : len;
    }

    public static int longestSubstring(String str){
        //abcabcbb
        int N = str.length();
        int s = 0;
        int e = 0;
        int len = 1;
        boolean[] isVisited = new boolean[26];
        while(e<N){
            if(!isVisited[str.charAt(e)- 'a']){
                isVisited[str.charAt(e) - 'a'] = true;
                e++;
            }else{
                len = Math.max(len, e-s);

                while(str.charAt(s) != str.charAt(e)){
                    isVisited[str.charAt(s) - 'a'] = false;
                    s++;
                }
                isVisited[str.charAt(s) - 'a'] = false;
                s++;
            }
        }
        return len;
    }


}
