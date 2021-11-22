/*
(SOLVED)
We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive).
Given an array of positive ints, return a new array of length "count" containing the first
endy numbers from the original array. Decompose out a separate isEndy(int n) method to
test if a number is endy. The original array will contain at least "count" endy numbers.
 */

import java.util.Arrays;

public class ap1copyEndy {
    public static void main(String[] args) {
        int[] nums = new int[] {9, 11, 90, 22, 6};
        int count = 2;

        System.out.println(Arrays.toString(copyEndy(nums, count)));
    }

    public static int[] copyEndy(int nums[], int count) {
        int[] output = new int[count];

        int outputIndex = 0;

        for(int i = 0; i < nums.length; i++) {
            if(outputIndex >= count) break;

            if(isEndy(nums[i])) {
                output[outputIndex] = nums[i];
                outputIndex++;
            }
        }

        return output;
    }

    public static boolean isEndy(int n) {
        if((n >= 0 && n <= 10) || (n >= 90 && n <= 100))
            return true;
        return false;
    }
}
