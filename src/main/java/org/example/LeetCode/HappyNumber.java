package org.example.LeetCode;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }

    public static boolean isHappy(int n){
        int sum = 0;
        int number;
        boolean flag = true;
        while(flag){
            number = n%10;
            sum = sum + number*number;
            n = n/10;
            System.out.println("sum:"+sum);
            if(sum == 1){
                System.out.println("here");
                return true;
            }
            if(n == 0){
                n = sum;
                sum = 0;
                System.out.println("n:"+n);
            }
        }
        return false;
    }
}
