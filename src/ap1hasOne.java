/*
(SOLVED)
Given a positive int n, return true if it contains a 1 digit. Note: use % to get the
rightmost digit, and / to discard the rightmost digit.
 */

public class ap1hasOne {
    public static void main(String[] args) {
        int input = 10;

        System.out.println(hasOne(input));
    }

    public static boolean hasOne(int n) {
        String conversion = Integer.toString(n);

        for(int i = 0; i < conversion.length(); i++) {
            if(conversion.charAt(i) == '1')
                return true;
        }
        return false;
    }
}
