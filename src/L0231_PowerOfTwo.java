/**
 * 判断一个数是否是2的幂
 */
public class L0231_PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0; // 如1000 & 0111 = 0000
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }
}
