package org.example.LeetCode;

public class ValidPalindrome {
    public static void main(String[] args) {
//        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
//        System.out.println(isPalindrome("race a car"));
//        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome("0P"));
    }
    public static boolean isPalindrome(String s){
        //97-122 a-z
        //65-90 A-Z
        int N = s.length();
        int l = 0;
        int r = N-1;
        while(l<r){
            int lAsciiValue = s.charAt(l);
            int rAsciiValue = s.charAt(r);
            System.out.println("l:"+l+", "+ s.charAt(l) +" "+", lasciiValue:"+lAsciiValue);
            System.out.println("r:"+r+", "+ s.charAt(r) +" "+", rasciiValue:"+rAsciiValue);
            if(!isaBoolean(lAsciiValue)){
                l++;
            }else if(!isaBoolean(rAsciiValue)){
                r--;
            }else if(((lAsciiValue >= 48 && lAsciiValue <= 57) &&  rAsciiValue == lAsciiValue)){
                System.out.println("match numbers");
                l++;
                r--;
            }else if(Math.abs(lAsciiValue-rAsciiValue) == 32 ){
                System.out.println("match alps");
                l++;
                r--;
            }else if(rAsciiValue == lAsciiValue){
                l++;
                r--;
            }else{
                return false;
            }
        }

        System.out.println("outt");
        System.out.println("l:"+l+", "+ s.charAt(l) +" "+", lasciiValue:");
        System.out.println("r:"+r+", "+ s.charAt(r) +" "+", rasciiValue:");
        return l==r || l>r;
    }

    private static boolean isaBoolean(int lAsciiValue) {
        return (lAsciiValue >= 97 && lAsciiValue <= 122) || (lAsciiValue >= 65 && lAsciiValue <= 90) || (lAsciiValue >= 48 && lAsciiValue <= 57);
    }
}
