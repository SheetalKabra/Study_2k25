package org.example.Trial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Altimetrik1 {
    public static void main(String[] args) {
        System.out.println(buildHighestNumber(new ArrayList<>(Arrays.asList(7, 8, 1)), 1000));
    }

    public static int buildHighestNumber(ArrayList<Integer> digits, int higherBound){
        digits.sort(Collections.reverseOrder());
        int ans = 0;
        for(int i=0; i<digits.size(); i++){
            ans = ans*10 + digits.get(i);
        }
        if(ans <= higherBound){
            return ans;
        }
        int findFirstDigitOfHB = higherBound/100;
        int firstDigit = 0;
        for(int i=0; i<digits.size(); i++){
            if(digits.get(i) < findFirstDigitOfHB){
                firstDigit = digits.get(i);
                break;
            }
        }
        ans = firstDigit;
        for(int i=0; i<digits.size(); i++){
            if(digits.get(i) != firstDigit){
                ans = ans*10 + digits.get(i);
            }
        }
        return ans;
    }
}
