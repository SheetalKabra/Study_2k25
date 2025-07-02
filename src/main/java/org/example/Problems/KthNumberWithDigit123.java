package org.example.Problems;

import java.util.LinkedList;
import java.util.Queue;

public class KthNumberWithDigit123 {
    public static void main(String[] args) {
        System.out.println(kthNumberWithDigit123(1));
        System.out.println(kthNumberWithDigit123(2));
        System.out.println(kthNumberWithDigit123(3));
        System.out.println(kthNumberWithDigit123(4));
        System.out.println(kthNumberWithDigit123(5));
        System.out.println(kthNumberWithDigit123(6));
        System.out.println(kthNumberWithDigit123(7));
        System.out.println(kthNumberWithDigit123(8));
        System.out.println(kthNumberWithDigit123(9));
        System.out.println(kthNumberWithDigit123(10));
        System.out.println(kthNumberWithDigit123(11));
    }

    public static String kthNumberWithDigit123(int k){
        Queue<String> queue = new LinkedList<>();
        int n = 0;
        String ans = null;
        queue.add("1");
        queue.add("2");
        queue.add("3");
        while(k != n){
            ans = queue.poll();
            queue.add(ans+"1");
            queue.add(ans+"2");
            queue.add(ans+"3");
            n++;
        }
        return ans;
    }
}
