/**
 * 求excel表某一大写字母标题对应的列数
 */
public class L0171_ExcelSheetColumnNumber {
    public static int titleToNumber(String columnTitle) {
        int ret = 0;
        // 类似于由26个字母表示的26进制，因此每一位都要乘26的该位次幂
        // 位上的字母都是相对于A的，因此需要加1（如第G行列数为'G'-'A'+1=7）
        for (int i = 0; i < columnTitle.length(); i++) {
            ret = ret * 26 + columnTitle.charAt(i) - 'A' + 1;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("ZY"));
    }
}
