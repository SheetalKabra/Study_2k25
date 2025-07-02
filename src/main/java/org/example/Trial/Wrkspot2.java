package org.example.Trial;

import java.util.*;
import java.util.stream.Collectors;

public class Wrkspot2 {
    public static void main(String[] args) {
        String text = "this is an example input";
//        System.out.println(Arrays.stream(text.split(" "))
//                .sorted(Comparator.comparingInt(String::length).reversed())
//                .collect(Collectors.joining(" ")));
//        Arrays.stream(text.split(" ")).sorted(Collections.reverseOrder());
        System.out.println(Arrays.stream(text.split(" ")).sorted().collect(Collectors.toList()));
        System.out.println(Arrays.stream(text.split(" ")).sorted(Collections.reverseOrder()).collect(Collectors.toList()));
        System.out.println(Arrays.stream(text.split(" ")).sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
//        System.out.println(Arrays.stream(text.split(" ")).sorted(Comparator.()).collect(Collectors.toList()));
//        System.out.println("example input this is an");
//        System.out.println(sortString(text));

    }

    //4, 2, 2, 7, 5
    //7, 5, 4, 2
    //2 is an
    //4 this
    //5 input
    //7 exmaple

    public static String sortString(String str){
        //sort the string based on the length of string
        int N = str.length();
        String[] strs = str.split(" ");
        ArrayList<Integer> strLenghts = new ArrayList<>();
        HashMap<Integer, String> map = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            strLenghts.add(strs[i].length());
        }
        for(int i=0; i<strs.length; i++){
            if(map.containsKey(strs[i].length())){
                String s = map.get(strs[i].length());
                s = s + " " +strs[i];
                map.put(strs[i].length(), s);
            }else{
                map.put(strs[i].length(), strs[i]);
            }
        }
        Collections.sort(strLenghts);
        List<Integer> uniqueStrLen = strLenghts.stream().distinct().collect(Collectors.toList());
        StringBuilder ans = new StringBuilder();
        for(int i=uniqueStrLen.size()-1; i>=0; i--){

            ans.append(map.get(uniqueStrLen.get(i)));
            ans.append(" ");
            map.remove(map.get(uniqueStrLen.get(i)));
        }
        return ans.toString();
    }

}
