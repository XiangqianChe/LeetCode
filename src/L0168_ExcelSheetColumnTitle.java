/**
 * 求excel表第某一列的标题（大写字母依次推进）
 */
public class L0168_ExcelSheetColumnTitle {
    public static String convertToTitle(int columnNumber) {
        StringBuilder ret = new StringBuilder();
        // 类似于由26个字母表示的26进制，因此向26求余作为当前位，求商以用于继续计算前一位
        // 位上的字母都在A的基础上加余数，因此需要先自减再求余（如第7行为'A'+(7-1)='G'）
        while (columnNumber > 0) {
            columnNumber--;
            ret.append((char)('A' + columnNumber % 26));
            columnNumber /= 26;
        }
        return ret.reverse().toString(); // 由于拼接是从低位到高位正着来的，所以最后要反过来
        // 类似于由26个字母表示的26进制，因此向26求余作为当前位，求商以用于计算前一位
        // 位上的字母都在A的基础上加余数，因此需要先减1再求余（如第7行为'A'+(7-1)='G'）
//        return columnNumber == 0 ? "" : convertToTitle(--columnNumber / 26) + (char)('A' + columnNumber % 26);
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }
}
