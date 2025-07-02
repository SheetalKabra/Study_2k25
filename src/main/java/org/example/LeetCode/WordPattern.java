package org.example.LeetCode;

import java.util.*;

public class WordPattern {
    public static void main(String[] args) {
        System.out.println(wordPAttern("abba", "dog cat cat dog"));
        System.out.println(wordPAttern("aaaa", "dog cat cat dog"));
        System.out.println(wordPAttern("abba", "dog cat cat fish"));
        System.out.println(wordPAttern("aba", "dog cat cat"));
        System.out.println(wordPAttern("abba", "dog dog dog dog"));
        System.out.println(wordPAttern("aa", "aa aa aa aa"));
    }

    public static boolean wordPAttern(String pattern, String s){
        Map<Character, String> map = new HashMap<>();
        Map<String, Character> map1 = new HashMap<>();
        String[] strArray = s.split(" ");
        if(pattern.length() != strArray.length){
            return false;
        }
        for(int i=0; i<pattern.length(); i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!Objects.equals(map.get(pattern.charAt(i)), strArray[i])){
                    return false;
                }
            }else{
                if(map1.containsKey(strArray[i])){
                    return false;
                }
                map.put(pattern.charAt(i), strArray[i]);
                map1.put(strArray[i], pattern.charAt(i));
            }
        }

        return true;
    }
}
