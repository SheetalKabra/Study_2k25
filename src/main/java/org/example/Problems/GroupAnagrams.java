package org.example.Problems;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupAnagrams {
    /**
     * 1. Put all given strings into set/map
     * 2. apply for each loop on given string array
     *      2.1 if set/map contains str[i]
     *          2.1.1. anagramGrp =  Call AnagramChecker(String[] strs, String str): which returns list of string which are anagram to each other
     *          2.1.2. and anagramGrp into ans
     *          2.1.3. now remove all strings of anagram from set/map
     *  3. return ans
     */

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"}));
    }

    public static ArrayList<ArrayList<String>> groupAnagrams(String[] strs){
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for(int i=0; i<strs.length; i++){
            set.add(strs[i]);
        }

        for(int i=0; i<strs.length; i++){
            if(set.contains(strs[i])){
                ArrayList<String> anagramGrp = AnagramChecker.anagramChecker( strs, strs[i]);
                ans.add(anagramGrp);
                //remove from set
                for(int j=0; j<anagramGrp.size(); j++){
                    set.remove(anagramGrp.get(j));
                }
            }
        }
        return ans;
    }
}
