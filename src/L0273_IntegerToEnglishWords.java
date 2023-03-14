/**
 * 将非负整数翻译为其英文形式
 */
public class L0273_IntegerToEnglishWords {
    public static String numberToWords(int num) {
        if (num == 0) return "Zero";
        StringBuilder words = new StringBuilder(); // 易于拼接
        final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};
        for (int i = 0; num > 0; i++, num /= 1000) { // 三位（000）为一组
            if (num % 1000 > 0)
                words.insert(0, helper(num % 1000) + THOUSANDS[i] + " ");
        }
        return words.toString().trim(); // 去掉i=0时在末尾多加的空格
    }
    // 转换1000以内的数字，作为THOUSANDS中元素的倍数
    private static String helper(int num) {
        final String[] BELOW_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        final String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        if (num < 20)
            return BELOW_20[num] + " ";
        else if (num < 100)
            return TENS[num / 10] + " " + helper(num % 10);
        else
            return BELOW_20[num / 100] + " Hundred " + helper(num % 100);
    }

    public static void main(String[] args) {
        System.out.println(numberToWords(1234567890));
    }
}
