package org.example.Trial;

import java.util.Arrays;

public class Altimetrik2 {
    //ThreadPool
    //Spring and SpringBoot: Internal working: Lifecycle of bean
    //Singelton, Protoype questions: in depth knowledge
    //Brush up on microservices




    public static void main(String[] args) {

        //int a = {1, 2}, b ={3, 4}
        System.out.println(Arrays.toString(findFractionSum(new int[]{1, 2}, new int[]{3, 4})));
        System.out.println(Arrays.toString(findFractionSum(new int[]{1, 2}, new int[]{3, 3})));
    }


    public static int[] findFractionSum(int[] a, int[] b){
        int denominator = 1;
          if(a[1] > b[1]){
              denominator = a[1]%b[1] == 0 ? a[1] : a[1]*b[1];
          }else{
              denominator = b[1]%a[1] == 0 ? b[1] : a[1]*b[1];
          }

          int numerator = a[0]*(denominator/a[1]) + b[0]*(denominator/b[1]);

          return new int[]{numerator, denominator};

    }
}
