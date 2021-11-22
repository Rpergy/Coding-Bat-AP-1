/*
(SOLVED)
Given an array of strings, return the count of the number of strings with the given length.
 */

public class ap1wordsCount {
    public static void main(String[] args) {
        String[] input = new String[] {"a", "bb", "b", "ccc"};
        int length = 1;

        System.out.println(wordsCount(input, length));
    }

    public static int wordsCount(String[] words, int len) {
        int total = 0;

        for(int i = 0; i < words.length; i++) {
            if(words[i].length() == len)
                total++;
        }

        return total;
    }
}
