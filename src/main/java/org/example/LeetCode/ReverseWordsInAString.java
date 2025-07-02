package org.example.LeetCode;

import java.util.Arrays;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        System.out.println(reverseWords("    the sky is moon   "));
//        System.out.println(reverseWords("  hello world  "));
//        System.out.println(reverseWords("a good   example"));

    }


    public static String reverseWords(String s){
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length; i++){
            if(!str[i].isEmpty()){
                sb.append(str[i]).append(" ");
            }
        }
        s = sb.toString();
        s = s.trim();

        char[] charArray = s.toCharArray();
        int l = 0;
        int r = charArray.length-1;
        while(l<r){
            char temp = charArray[l];
            charArray[l] = charArray[r];
            charArray[r] = temp;
            l++;
            r--;
        }

        l=0;
        r=0;
        for(int i=0; i<charArray.length; i++){
            if(charArray[i] == ' '){
                r = i-1;
                while(l < r){
                    char temp = charArray[l];
                    charArray[l] = charArray[r];
                    charArray[r] = temp;
                    l++;
                    r--;
                }
                l = i+1;
            }
        }
        r = charArray.length - 1;
        while(l < r){
            char temp = charArray[l];
            charArray[l] = charArray[r];
            charArray[r] = temp;
            l++;
            r--;
        }
        return new String(charArray);



    }
    public static String reverseWords1(String str){
        String[] sp = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<sp.length; i++){
            if(!sp[i].isEmpty()){
                sb.append(sp[i]).append(" ");
            }
        }
        str = sb.toString();
        str = str.trim();


        char[] a = str.toCharArray();

        int l = 0;
        int r = a.length-1;
        while(l<r){
            char temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
        l = 0;
        r = 0;
        for(int i=0; i<a.length; i++){
            if(a[i] == ' '){
                r = i-1;
                while(l<r){
                    char temp = a[l];
                    a[l] = a[r];
                    a[r] = temp;
                    l++;
                    r--;
                }
                l = i+1;
            }
        }
        r = a.length-1;
        while(l<r){
            char temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
        return new String(a);
    }


    public static String reverseString(String s){
        char[] chars = s.toCharArray();
        int l = 0;
        int r = s.length()-1;
        char temp;
        while(l<r){
            temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;
            l++;
            r--;
        }
        return new String(chars);
    }
}
