/**
 * 求斐波那契数列的第几项
 */
public class L0509_FibonacciNumber {
    public static int fib(int n) {
        if (n <= 1) return n;
        return fib(n-1) + fib(n-2); // 递归揭示本质
    }

    public static void main(String[] args) {
        System.out.println(fib(7));
    }
}
