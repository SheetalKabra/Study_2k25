package org.example.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FirstNonRepeating {
    public static void main(String[] args) {
        System.out.println(firstNonRepeatingElement(new ArrayList<>(Arrays.asList(1,2,3,1,2,5))));
    }

    public static int firstNonRepeatingElement(ArrayList<Integer> arrayList){
        int N = arrayList.size();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<N; i++){
            if(map.containsKey(arrayList.get(i))){
                map.put(arrayList.get(i), map.get(arrayList.get(i))+1);
            }else{
                map.put(arrayList.get(i), 1);
            }
        }
        for(int i=0; i<N; i++){
            if(map.get(arrayList.get(i)) == 1){
                return arrayList.get(i);
            }
        }
        return -1;
    }
}
