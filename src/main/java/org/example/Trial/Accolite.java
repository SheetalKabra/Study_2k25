package org.example.Trial;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Accolite {
    public static void main(String[] args) {
        String a = "hello";
        String b = "he" + "llo";
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(KLongestSubString("2aabbacaacbac"));
        System.out.println(checkAllElementsPresent(new HashSet<>(Arrays.asList(3,2,4,1)), new HashSet<>(Arrays.asList(1,5,4,2))));
    }

    public static String KLongestSubString(String str){
//        int k = Integer.parseInt(String.valueOf(str.charAt(0)));
//        Map<Character, Integer> map = new HashMap<>();
//
//        System.out.println(k);
        return null;
    }

    public static boolean checkAllElementsPresent(HashSet<Integer> set1, HashSet<Integer> set2){
        if(set1.size() != set2.size()){
            return false;
        }
        for(Integer element: set1){
            if(!set2.contains(element)){
                return false;
            }
        }
        return true;
    }
}
