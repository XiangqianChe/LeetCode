/**
 * 如果正整数的质因子只有2、3、5，则为丑数。寻找第n个丑数。
 */
public class L0264_UglyNumberII {
    public static int nthUglyNumber(int n) {
        // 创建大小为n的数组，依次直接求出前n个丑数
        int[] uglys = new int[n];
        int factor2 = 2, factor3 = 3, factor5 = 5; // factorN代表以N为因子的丑数
        int index2 = 0, index3 = 0, index5 = 0; // indexN代表factorN的序数
        uglys[0] = 1; // 第一个丑数为1
        for (int i = 1; i < n; i++) {
            uglys[i] = Math.min(Math.min(factor2, factor3), factor5); // 选出3个潜在丑数中的最小值
            if (uglys[i] == factor2) factor2 = uglys[++index2] * 2; // 如果当前最小值为factor2，将其取为下一个factor2（序数为index2 + 1）
            if (uglys[i] == factor3) factor3 = uglys[++index3] * 3; // 如果当前最小值为factor3，将其取为下一个factor3（序数为index3 + 1）
            if (uglys[i] == factor5) factor5 = uglys[++index5] * 5; // 如果当前最小值为factor5，将其取为下一个factor5（序数为index5 + 1）
        }
        return uglys[n - 1]; // 取出数组中最后一个丑数
    }

    public static void main(String[] args) {
        System.out.println(nthUglyNumber(10));
    }
}
