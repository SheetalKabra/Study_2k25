package org.example.Problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AnagramCheck {
    public static void main(String[] args) {
        System.out.println(checkAnagram("tea", "ate"));
        System.out.println(checkAnagram("tea", "ata"));
        System.out.println(checkAnagram("listen", "silent"));
        System.out.println(checkAnagram("hello", "world"));
    }

    public static boolean checkAnagram(String str1, String str2) {
        int N = str1.length();
        int M = str2.length();
        if(N == M){
            Map<Character, Integer> map = createHashMap(str1);
            for(int i=0; i<N; i++){
                if(map.containsKey(str2.charAt(i))){
                    if(map.get(str2.charAt(i)) == 1){
                        map.remove(str2.charAt(i));
                    }else{
                        map.put(str2.charAt(i), map.get(str2.charAt(i))-1);
                    }
                }else{
                    return false;
                }
            }
            if(map.isEmpty()){
                return true;
            }

        }

        return false;
    }

    public static Map<Character, Integer> createHashMap(String str){
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i), 1);
            }
        }
        return map;
    }



}
