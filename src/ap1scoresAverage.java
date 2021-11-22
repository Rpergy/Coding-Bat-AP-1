/*
(SOLVED)
Given an array of scores, compute the int average of the first half and the second half,
and return whichever is larger. We'll say that the second half begins at index length/2.
The array length will be at least 2. To practice decomposition, write a separate helper method
int average(int[] scores, int start, int end) { which computes the average of the
elements between indexes start..end. Call your helper method twice to implement
scoresAverage(). Write your helper method after your scoresAverage() method in the
JavaBat text area. Normally you would compute averages with doubles, but here we use
ints so the expected results are exact.
 */

public class ap1scoresAverage {
    public static void main(String[] args) {
        int[] input = new int[] {2, 2, 4, 4};

        System.out.println(scoresAverage(input));
    }

    public static int scoresAverage(int[] scores) {
        int half = scores.length / 2;

        int firstHalfAverage = average(scores, 0, half - 1);
        int lastHalfAverage = average(scores, half, scores.length - 1);

        return Math.max(firstHalfAverage, lastHalfAverage);
    }

    public static int average(int[] scores, int start, int end) {
        int average = 0;

        int total = 0;

        for(int i = start; i <= end; i++) {
            total += scores[i];
        }

        average = total / (end - start + 1);

        return average;
    }
}
