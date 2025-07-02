package org.example.Trial;

import java.util.HashSet;

public class NonRepeatingChars {
    public static void main(String[] args) {
//        System.out.println(getLargestSubstring("aebcabfgcdb"));
        System.out.println(getLargestSubstring("aebcabgcb@#gbkdb#"));
        System.out.println(getLargestSubstring("abcdea"));
    }

    public static int getLargestSubstring(String s){
        char[] chars = s.toCharArray();
        int l = 0;
        int r = 0;
        int ans = Integer.MIN_VALUE;
        HashSet<Character> set = new HashSet<>();
        while(r < chars.length){
            if(!set.contains(chars[r])){
                set.add(chars[r]);
                r++;
                ans = Math.max(ans, set.size());
            }else{
                set.remove(chars[l]);
                l++;
            }
        }
        return ans;
    }
}
