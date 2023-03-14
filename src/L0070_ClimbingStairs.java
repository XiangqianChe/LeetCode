/**
 * 每步可以迈1至2层台阶，上n层台阶的方法有几种
 */
public class L0070_ClimbingStairs {
    public static int climbStairs(int n) {
        if (n == 1) return 1; // 上1层台阶的方法有1种（迈1层）
        if (n == 2) return 2; // 上0层台阶的方法有2种（迈1层+1层，迈2层）
        // 斐波那契数列的递归
        // 先迈1层，剩余n-1层，同上n-1层台阶的方法
        // 加上
        // 先迈2层，剩余n-2层，同上n-2层台阶的方法
        return climbStairs(n-1) + climbStairs(n-2);
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(4));
        System.out.println(climbStairs(5));
        System.out.println(climbStairs(6));
    }
}
