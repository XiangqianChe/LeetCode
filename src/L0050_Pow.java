/**
 * 求一个浮点数的整数次幂（可能为负），不使用内置方法
 */
public class L0050_Pow {
    public static double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n < 0) { // 将负数次幂转化为正数次幂
            n = -n;
            x = 1.0 / x;
        }
        return (n % 2 == 0) ? myPow(x*x,n/2) : x * myPow(x*x,n/2); // 通过求平方减少递归次数
    }

    public static void main(String[] args) {
        System.out.println(myPow(-2,-3));
    }
}
