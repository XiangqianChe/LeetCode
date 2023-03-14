/**
 * 将字符串中的元音字母前后互换
 */

public class L0345_ReverseVowelsOfAString {
    public static String reverseVowels(String s) {
        String vowels = "AEIOUaeiou";
        char[] chars = s.toCharArray();
        // 头尾两指针依次互换
        int start = 0, end = s.length() - 1;
        while (start < end) {
            while (start < end && !vowels.contains(chars[start] + "")) start++;
            while (start < end && !vowels.contains(chars[end] + "")) end--;
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++; end--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }
}
