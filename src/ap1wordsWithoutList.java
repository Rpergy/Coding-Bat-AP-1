/*
(SOLVED)
Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given length are omitted.
 */

import java.util.ArrayList;
import java.util.List;

public class ap1wordsWithoutList {
    public static void main(String[] args) {
        String[] input = new String[] {"a", "bb", "b", "ccc"};
        int length = 1;

        System.out.println(wordsWithoutList(input, length));
    }

    public static List wordsWithoutList(String[] words, int len) {
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < words.length; i++) {
            if(words[i].length() != len)
                list.add(words[i]);
        }

        return list;
    }
}
