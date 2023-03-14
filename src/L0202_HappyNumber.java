/**
 * 一个数是否是快乐数（各位的平方和求和，如此重复，最后等于1）
 */
public class L0202_HappyNumber {
    public static boolean isHappy(int n) {
        // 如果最后不等于1，就会陷入循环，因此设定快慢两个指针，若两者能重合，则循环存在
        int slow = n, fast = n;
        do {
            if (fast == 1) return true;
            slow = next(slow);
            fast = next(next(fast));
        } while (slow != fast);
        return false;
    }

    private static int next(int n) {
        int next = 0;
        while (n != 0) {
            next += (n % 10) * (n % 10);
            n /= 10;
        }
        return next;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
    }
}
