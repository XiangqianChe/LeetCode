/**
 * 找出三角形数组从上到下路径中，路径节点之和的最小值（节点只能从自己的左右子节点寻路）
 */
import java.util.ArrayList;
import java.util.List;

public class L0120_Triangle {
    public static int minimumTotal(List<List<Integer>> triangle) {
        for (int i = triangle.size() - 2; i >= 0; i--) { // 从倒数第二层开始
            for (int j = 0; j <= i; j++) {
                // 逐个找出该层每个节点左右子节点中的较小者，将其加到自身
                triangle.get(i).set(j,
                        triangle.get(i).get(j) + Math.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1))
                );
            }
        }
        return triangle.get(0).get(0); // 最终根节点上存储着节点路径之和的最小值
    }

    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> tier0 = new ArrayList<>(), tier1 = new ArrayList<>(),
                tier2 = new ArrayList<>(),tier3 = new ArrayList<>();
        tier0.add(2);
        tier1.add(3); tier1.add(4);
        tier2.add(6); tier2.add(5); tier2.add(7);
        tier3.add(4); tier3.add(1); tier3.add(8); tier3.add(3);
        triangle.add(tier0);triangle.add(tier1);triangle.add(tier2);triangle.add(tier3);
        System.out.println(minimumTotal(triangle));
    }
}
