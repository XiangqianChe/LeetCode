/**
 * 求字符串中被空格分割的片段的数量
 */
public class L0434_NumberOfSegmentsInAString {
    public static int countSegments(String s) {
        String trimmed = s.trim();
        // trimmed为“”时，trimmed.split("\s+").length为1，不符合实际情况，改为0
        return trimmed.length() == 0 ? 0 : trimmed.split("\s+").length;
    }

    public static void main(String[] args) {
        System.out.println(countSegments("Hello, my name is John"));
    }
}
