/**
 * 循环地求一个数各位数字之和直至达到个位数
 */
public class L0258_AddDigits {
    public static int addDigits(int num) {
        return num == 0 ? 0 : (num - 1) % 9 + 1; // 正数的结果都是其对9的余数，如果余数为0则结果为9
    }

    public static void main(String[] args) {
        System.out.println(addDigits(36));
    }
}
