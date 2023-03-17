/**
 * 父母给孩子分饼干，g代表每个孩子需要的饼干大小，s代表现有饼干，求总共能满足几个孩子
 * （不考虑用多个饼干满足1个孩子的情况）
 */
import java.util.Arrays;

public class L0455_AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {
        // 升序排序
        Arrays.sort(g);
        Arrays.sort(s);
        int m = 0, n = 0;
        while (m < g.length && n < s.length) {
            if (g[m] <= s[n]) { // 满足则孩子+1，看下一个孩子
                m++;
            }
            n++; // 无论这个饼干是否满足，都要看下一个饼干能否满足
        }
        return m; // 返回满足的孩子数
    }

    public static void main(String[] args) {
        int[] g = {1,2,3}, s = {1,2};
        System.out.println(findContentChildren(g, s));
    }
}
