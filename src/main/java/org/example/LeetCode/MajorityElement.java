package org.example.LeetCode;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3}));
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
        System.out.println(majorityElement(new int[]{2}));
        System.out.println(majorityElement(new int[]{10,9,9,9,10}));
    }

    public static int majorityElement(int[] nums){
        int N = nums.length;
        int majElement = -1;
        int count = 0;
        for(int i=0; i<N; i++){
            if(majElement == -1){
                majElement = nums[i];
                count++;
            }else if(majElement == nums[i]){
                count++;
            }else{
                count--;
                if(count == 0){
                    majElement = -1;
                }
//                if(count < 0){
//                    majElement = nums[i];
//                }
            }
        }
        return majElement;
    }
}
