/**
 * 返回数组表示的数加一后的数组，如[9,9]变成[1,0,0]
 */

import java.util.Arrays;

public class L0066_PlusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) { // 如[1,2,3]变成[1,2,4]
                digits[i]++;
                return digits;
            } else { // 如[8,9]变成[9,0]
                digits[i] = 0;
            }
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits; // 如[9,9]变成[1,0,0]
    }

    public static void main(String[] args) {
        int[] digits = {9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
