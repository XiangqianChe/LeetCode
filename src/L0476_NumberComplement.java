/**
 * 求一个数的二进制补数，如5（101）的补数为2（010）
 */
public class L0476_NumberComplement {
    public static int findComplement(int num) {
        // 如5（101）最高位的1代表的十进制数是4（100），* 2 - 1后会得到7（111），- num即得补数
        return Integer.highestOneBit(num) * 2 - 1 - num;
    }

    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }
}
