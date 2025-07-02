package org.example.Problems;

import java.util.*;

public class NobleIntegersWithDuplicateElements {
    public static void main(String[] args) {
        System.out.println(countNobleIntegers(new ArrayList<>(Arrays.asList(-10,1,1,1,4,4,4,7,10))));
    }

    public static int countNobleIntegers(ArrayList<Integer> arrayList){
        int nobleInteger = 0;
        Collections.sort(arrayList);
        List<Integer> countArr = new ArrayList<>();
        countArr.add(0);
        for(int i=1; i<arrayList.size(); i++){
            if(Objects.equals(arrayList.get(i), arrayList.get(i - 1))){
                countArr.add(countArr.get(i-1));
            }else{
                countArr.add(i);
            }
        }
        System.out.println(countArr);
        for(int i=0; i<arrayList.size(); i++){
            if(Objects.equals(arrayList.get(i), countArr.get(i))){
                nobleInteger++;
            }
        }
        return nobleInteger;
    }
}
