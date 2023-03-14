/**
 * 判断一个数是否为平方数
 */
public class L0367_ValidPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        int x = num;
        while (x * x > num) { // 算术平均数 >= 几何平均数，持续逼近直到两数几乎相等
            x = (x + num / x) / 2;
        }
        return x * x == num;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(15));
    }
}
