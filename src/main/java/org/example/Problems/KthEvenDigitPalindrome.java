package org.example.Problems;

import java.util.LinkedList;
import java.util.Queue;

public class KthEvenDigitPalindrome {
    public static void main(String[] args) {

        System.out.println(kthEvenDigitPalindrome(1));
        System.out.println(kthEvenDigitPalindrome(10));
    }

    public static String kthEvenDigitPalindrome(int A){
        Queue<String> queue = new LinkedList<String>();
        queue.add("11");
        queue.add("22");
        int k=0;
        String ans = null;
        while(k != A){
            ans = queue.poll();
            int mid = ans.length()/2;
            queue.add(ans.substring(0, mid) + "11" + ans.substring(mid));
            queue.add(ans.substring(0, mid) + "22" + ans.substring(mid));
            k++;

        }
        return ans;

    }
}
