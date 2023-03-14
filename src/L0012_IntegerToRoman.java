/**
 * 整数转罗马数
 */
public class L0012_IntegerToRoman {
    public static String inToRoman(int num) {
        // 平铺直叙，大巧若拙
        String[] M = {"", "M", "MM", "MMM"};
        String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] +I[num%10];
    }

    public static void main(String[] args) {
        System.out.println(inToRoman(1990));
    }
}
