/**
 * 二进制形式的两数不同的位的数量叫做汉明距离
 */
public class L0461_HammingDistance {
    public static int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y); // 异或后计数
    }

    public static void main(String[] args) {
        System.out.println(hammingDistance(1,3));
    }
}
