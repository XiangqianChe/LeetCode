/**
 * 获取帕斯卡三角（杨辉三角）的某一行
 */
import java.util.ArrayList;
import java.util.List;

public class L0119_PascalsTriangleII {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        // 倒序遍历行中的元素，当其前1位存在时，在本位上加前1位，最后补1
        // i = 0: (1) -> 1
        // i = 1: 1 (1) -> 1 1
        // i = 2: 1 1(+1) (1) -> 1 2 1
        // i = 3: 1 2(+1) 1(+2) (1) -> 1 3 3 1
        // i = 4: 1 3(+1) 3(+3) 1(+3) -> 1 4 6 4 1
        for (int i = 0; i < rowIndex; i++) {
            for (int j = i - 1; j >= 1; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
            row.add(1);
        }
        return row;
    }

    public static void main(String[] args) {
        System.out.println(getRow(6));
    }
}
