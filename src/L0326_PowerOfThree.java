/**
 * 判断一个数是否为3的幂
 */
public class L0326_PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        if (n < 1) return false;
        while (n % 3 == 0) // 除3能除尽，最后等于1
            n /= 3;
        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
    }
}
