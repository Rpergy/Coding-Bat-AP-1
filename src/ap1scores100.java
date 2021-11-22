/*
(SOLVED)
Given an array of scores, return true if there are scores of 100 next to each other in the array. The array length will be at least 2.
 */

public class ap1scores100 {
    public static void main(String[] args) {
        int[] input = new int[] {1, 100, 100};

        System.out.println(scores100(input));
    }

    public static boolean scores100(int[] scores) {
        for(int i = 0; i < scores.length - 1; i++) {
            if(scores[i] == 100 && scores[i] == scores[i + 1])
                return true;
        }
        return false;
    }
}
