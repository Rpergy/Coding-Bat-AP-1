/*
(SOLVED)
Given an array of positive ints, return a new array of length "count" containing the first
even numbers from the original array. The original array will contain at least "count" even
numbers.
 */

import java.util.Arrays;

public class ap1copyEvens {
    public static void main(String[] args) {
        int[] numbers = new int[] {3, 2, 4, 5, 8};
        int count = 2;

        System.out.println(Arrays.toString(copyEvens(numbers, count)));
    }

    public static int[] copyEvens(int[] nums, int count) {
        int[] output = new int[count];

        int outputIndex = 0;

        for(int i = 0; i < nums.length; i++) {
            if(outputIndex >= count) break;
            if(nums[i] % 2 == 0) {
                output[outputIndex] = nums[i];
                outputIndex++;
            }
        }

        return output;
    }
}
