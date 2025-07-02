package org.example.LeetCode;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }

    public static int lengthOfLastWord(String s){
        int N = s.length();
        boolean flag = true;
        int ans = 0;
        int i = N-1;

        while(flag){
            if(s.charAt(i) == ' '){
                i--;
            }else{
                flag = false;
            }
        }
        System.out.println("i:"+i);
        flag = true;
        while(flag){
            if(s.charAt(i) != ' '){
                ans++;
                i--;
            }else{
                flag = false;
            }
        }
        return ans;
    }
}
