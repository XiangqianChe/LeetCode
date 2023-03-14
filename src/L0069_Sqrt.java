/**
 * 不使用内置方法的情况下求平方根
 */
public class L0069_Sqrt {
    public static int mySqrt(int x) {
        int r = x; // 先假设极端情况，一个数与其平方根相等
        while (r * r > x) {
            r = (r + x / r) / 2; // 因为a + b >= 2√ab，所以r + x / r >= 2√x；当r = √x时，左右相等；通过不断循环求值逐渐逼近x的平方根
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(195));
    }
}
