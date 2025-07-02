package org.example.Problems;


public class SortCharArray {
    public static void main(String[] args) {
        System.out.println(sortCharArray(new char[] {'d','a','b','a','c','b','d'}));
        System.out.println(sortCharArray(new char[] {'d','a','b','a','c','z','e'}));
    }

    public static char[] sortCharArray(char[] arr){
        int[] frequencyArr = new int[26];
        int N = arr.length;
        for(int i=0; i<N; i++){
            frequencyArr[arr[i]-97]++;
        }
        int index = 0;
        for(int i=0; i<26; i++){
            int freq = frequencyArr[i];
            while(freq > 0){
                arr[index] = (char) (i+97);
                freq--;
                index++;
            }
        }
        return arr;
    }
}
