package org.example.Problems;

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("its a good weather"));
    }

    public static String reverseWords(String str){
        int N = str.length();
        int s = 0;
        int e = N-1;
        char[] charArrayOfstr = str.toCharArray();
        while(s<e){
            char temp = charArrayOfstr[s];
            charArrayOfstr[s] = charArrayOfstr[e];
            charArrayOfstr[e] = temp;
            s++;
            e--;
        }
        s = 0;
        e = N;
        int sOfWord = 0;
        int eOfWord = -1;
        while(s<e){
            if(charArrayOfstr[s] == ' '){
                reversePartOfArray(charArrayOfstr, sOfWord, eOfWord);
                sOfWord=s+1;
            }
            eOfWord++;
            s++;

        }
        reversePartOfArray(charArrayOfstr, sOfWord, eOfWord);
        return String.valueOf(charArrayOfstr);
    }

    public static char[] reversePartOfArray(char[] arr, int start, int end){
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
