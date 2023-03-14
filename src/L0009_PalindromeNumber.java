/**
 * 判断回文数
 */
public class L0009_PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) { // 负数或零以外的10的倍数不可
            return false;
        }
        int revertedNumber = 0;
        while (x > revertedNumber) { // 位数为奇数的回文数不需要考虑中间位
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber / 10; // 位数为偶数如99时；位数为奇数如101时
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(99));
        System.out.println(isPalindrome(100));
        System.out.println(isPalindrome(101));
    }
}
