package org.example.Problems;

public class ReverseCharArrayPart {
    public static void main(String[] args) {
        System.out.println(reversePartOfArray(new char[] {'a','n','a','c','o','n','d','a'}, 2,5));
    }

    public static char[] reversePartOfArray(char[] arr, int start, int end){
        int N = arr.length;
        while (start<end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
