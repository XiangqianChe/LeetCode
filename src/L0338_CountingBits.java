/**
 * 计算从0到n所有数的二进制形式中1的数量
 */
import java.util.Arrays;

public class L0338_CountingBits {
    public static int[] countBits(int n) {
        int[] ret = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            ret[i] = ret[i / 2] + i % 2; // i的二进制是在i/2的二进制后面加0或1
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));
    }
}
