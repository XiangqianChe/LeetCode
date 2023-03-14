/**
 * 形成指定行数的帕斯卡三角（杨辉三角）
 */
import java.util.ArrayList;
import java.util.List;

public class L0118_PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> allRows = new ArrayList<>(); // 存放所有行
        List<Integer> row = new ArrayList<>(); // 临时行
        // 倒序遍历临时行中的元素，当其前1位存在时，在本位上加前1位，最后补1，形成新行
        // i = 0: (1) -> 1
        // i = 1: 1 (1) -> 1 1
        // i = 2: 1 1(+1) (1) -> 1 2 1
        // i = 3: 1 2(+1) 1(+2) (1) -> 1 3 3 1
        // i = 4: 1 3(+1) 3(+3) 1(+3) -> 1 4 6 4 1
        for (int i = 0; i < numRows; i++) {
            for (int j = i - 1; j >= 1; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
            row.add(1);
            allRows.add(new ArrayList<>(row));
        }
        return allRows;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
