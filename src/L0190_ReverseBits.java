/**
 * 将一个32位二进制数反转得到的数字（十进制）是多少
 */
public class L0190_ReverseBits {
    public static int reverseBits(int n) {
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            ret <<= 1; // ret左移1位，将其个位空出来
            ret += n & 1; // 计算出n的个位，加到ret上
            n >>= 1; // n右移1位，将原来的上一位变成新的个位
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(reverseBits(0b00000010100101000001111010011100) == 964176192);
    }
}
