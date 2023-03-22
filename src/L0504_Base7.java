/**
 * 十进制转化为七进制
 */
public class L0504_Base7 {
    public static String convertToBase7(int num) {
        if (num < 0) { // 负数转化成正数再计算
            return "-" + convertToBase7(-num);
        }
        if (num < 7) { // 在0到6时直接将其拼接至字符串前端，而不使用最后一行的计算方法，防止产生首位的0
            return "" + num;
        }
        return convertToBase7(num / 7) + num % 7;
    }

    public static void main(String[] args) {
        System.out.println(convertToBase7(7));
    }
}
