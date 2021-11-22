/*
(SOLVED)
Given an array of strings, return a new array containing the first N strings.
N will be in the range 1..length.
 */

import java.util.Arrays;

public class ap1wordsFront {
    public static void main(String[] args) {
        String[] input = new String[] {"a", "b", "c", "d"};
        int n = 2;

        System.out.println(Arrays.toString(wordsFront(input, n)));
    }

    public static String[] wordsFront(String[] words, int n) {
        String[] output = new String[n];

        for(int i = 0; i < n; i++) {
            output[i] = words[i];
        }

        return output;
    }
}
