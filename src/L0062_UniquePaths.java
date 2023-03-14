/**
 * 从m*n的棋盘左上角走到右下角，每次只能向右或向下走1步，共有几种走法
 */
public class L0062_UniquePaths {
    // 向右需要走m-1步，向下需要走n-1步，共m+n-2步
    // 所以是从m+n-2步中选择m-1个向右走的步（或n-1个向下走的步）的组合问题
    // 但用递归更简洁
    public static int uniquePaths(int m, int n) {
        if (m == 1 || n == 1) return 1; // 只有1行或1列时只有1种走法
        return uniquePaths(m-1,n) + uniquePaths(m,n-1);
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(7,3));
    }
}
