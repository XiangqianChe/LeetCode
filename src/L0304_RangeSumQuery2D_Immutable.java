/**
 * 实现二维数组类，包含求坐标row1到row2、col1到col2的数值之和的方法，数组不可更改
 */
public class L0304_RangeSumQuery2D_Immutable {
    static class NumMatrix {
        private final int[][] dp;
        public NumMatrix(int[][] matrix) {
            // 在参数数组各坐标上求之前的累积和，再作初始化
            // 这样用于sumRegion方法时，可以减少重复计算
            int m = matrix.length, n = matrix[0].length;
            dp = new int[m + 1][n + 1]; // dp[i+1][j+1]存放的是matrix[i][j]及以内的数之和
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    dp[i+1][j+1] = dp[i+1][j] + dp[i][j+1] - dp[i][j] + matrix[i][j];
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            return dp[row2+1][col2+1] - dp[row1][col2+1] - dp[row2+1][col1] + dp[row1][col1];
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{3,0,1,4,2},{5,6,3,2,1},{1,2,0,1,5},{4,1,0,1,7},{1,0,3,0,5}};
        NumMatrix numMatrix = new NumMatrix(matrix);
        System.out.println(numMatrix.sumRegion(1,1,2,2));
        System.out.println(numMatrix.sumRegion(0,1,0,2));
        System.out.println(numMatrix.sumRegion(1,0,2,0));
        System.out.println(numMatrix.sumRegion(0,0,2,2));
    }
}
