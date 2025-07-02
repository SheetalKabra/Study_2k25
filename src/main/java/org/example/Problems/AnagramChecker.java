package org.example.Problems;

import java.util.ArrayList;

public class AnagramChecker {
    public static void main(String[] args) {
        System.out.println(anagramChecker(new String[]{"eat","tea","tan","ate","nat","bat"}, "taa"));
        System.out.println(anagramChecker(new String[]{"eat","tea","tan","ate","nat","bat"}, "tae"));
    }

    public static ArrayList<String> anagramChecker(String[] strs, String str){
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i<strs.length; i++){
            boolean isAnagram = AnagramCheck.checkAnagram(strs[i], str);
            if(isAnagram){
                ans.add(strs[i]);
            }
        }
        return ans;
    }
}
