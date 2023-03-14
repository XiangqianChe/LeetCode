/**
 * 如果正整数的质因子只有2、3、5，则为丑数
 */
public class L0263_UglyNumber {
    public static boolean isUgly(int n) {
        if (n <= 0) return false; // 排除负数和0
        int[] factors = {2,3,5};
        for (int f : factors) {
            while (n % f == 0) { // 轮流除2、3、5直到除不尽
                n /= f;
            }
        }
        return n == 1; // 丑数没有其他质因子，应得到1
    }

    public static void main(String[] args) {
        System.out.println(isUgly(15));
    }
}
