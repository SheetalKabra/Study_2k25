package org.example.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindFrequency {
    public static void main(String[] args) {
        System.out.println(findFrequency(new ArrayList<>(Arrays.asList(2,6,3,8,2,8,2,3,8,10,6,9)), new ArrayList<>(Arrays.asList(2,6,8,3))));
    }

    public static ArrayList<Integer> findFrequency(ArrayList<Integer> arr, ArrayList<Integer> queries){
        Map<Integer, Integer> map = new HashMap<>();
        int N = arr.size();
        for(int i=0; i<N; i++){
            if(map.containsKey(arr.get(i))){
                map.put(arr.get(i), map.get(arr.get(i))+1);
            }else{
                map.put(arr.get(i), 1);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<queries.size(); i++){
            ans.add(map.get(queries.get(i)));
        }
        return ans;
    }
}
