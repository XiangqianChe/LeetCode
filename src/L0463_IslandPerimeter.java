/**
 * i * j的网格中，值为0代表水，为1代表地，求岛屿（地的组合）的周长
 */
public class L0463_IslandPerimeter {
    public static int islandPerimeter(int[][] grid) {
        int lands = 0, adjacent = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    lands++; // 地的数量
                    if (i + 1 < grid.length && grid[i + 1][j] == 1) {
                        adjacent++; // 上下相邻的数量
                    }
                    if (j + 1 < grid[0].length && grid[i][j + 1] == 1) {
                        adjacent++; // 左右相邻的数量
                    }
                }
            }
        }
        return lands * 4 - adjacent * 2; // 每块地的周长减去相邻地的两条边长
    }

    public static void main(String[] args) {
        int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        System.out.println(islandPerimeter(grid));
    }
}
