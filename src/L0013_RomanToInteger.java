/**
 * 罗马数转整数
 */
public class L0013_RomanToInteger {
    public static int romanToInt(String s) {
        // 替换为本质
        s = s.replace("IV","IIII").replace("IX","VIIII")
                .replace("XL","XXXX").replace("XC","LXXXX")
                .replace("CD","CCCC").replace("CM","DCCCC");
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I' -> num += 1;
                case 'V' -> num += 5;
                case 'X' -> num += 10;
                case 'L' -> num += 50;
                case 'C' -> num += 100;
                case 'D' -> num += 500;
                case 'M' -> num += 1000;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
