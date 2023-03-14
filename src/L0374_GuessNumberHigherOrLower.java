/**
 * 在1到n的范围中猜目标数，每次猜后给出提示（高了提示-1，低了提示1，猜中提示0）
 */
class GuessGame {
    private static final int pick = 6;
    static int guess(int num) {
        return Integer.compare(pick, num);
    }
}

public class L0374_GuessNumberHigherOrLower extends GuessGame {
    public static int guessNumber(int n) {
        int start = 1, end = n, mid;
        while (start < end) {
            mid = start + (end - start) / 2;
            if (guess(mid) > 0) {
                start = mid + 1;
            } else if (guess(mid) < 0) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        System.out.println(guessNumber(10));
    }
}
