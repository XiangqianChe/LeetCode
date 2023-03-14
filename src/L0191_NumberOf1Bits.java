/**
 * 求一个32位二进制数中1出现的次数
 */
public class L0191_NumberOf1Bits {
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { // 直到不再包含1
            count += (n & 1); // 个位为1，则加1
            n >>= 1; // 右移1位，前一位变个位
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(0b00000000000000000000000000001011) == 3);
    }
}
