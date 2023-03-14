/**
 * 计算一个正整数能分成最少几个数的平方和
 */
public class L0279_PerfectSquares {
    public static int numSquares(int n) {
        int[] dp = new int[n + 1]; // 存放0到n的结果
        int min;
        for (int i = 1; i <= n; i++) { // dp[0]仍为0，从dp[1]开始计算到dp[n]
            min = n; // 最大不过n
            for (int j = 1; j*j <= i ; j++) { // 用来计算组成dp[i]的平方数的范围
                min = Math.min(min, dp[i - j*j] + 1); // 在dp[i - j*j]的基础上，加的1为当前的j*j
            }
            dp[i] = min; // 以上能得到的最小值即为结果
        }
        return dp[n]; // 返回最后的dp[n]
    }


    public static void main(String[] args) {
            System.out.println(numSquares(13));
    }
}
