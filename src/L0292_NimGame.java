/**
 * 两人轮流拿一堆石子，每人每次可拿1~3颗，如果你先拿，石子数量为多少时能够必赢
 */
public class L0292_NimGame {
    public static boolean canWinNim(int n) {
        // 如果石子数量是4的倍数，如果你取x，对方必取4-x，这样必输
        // 如果石子数量是4的倍数有余数1~3，只要你先取余数，之后对方取x，你取4-x，这样必赢
        return n % 4 != 0;
    }

    public static void main(String[] args) {
        System.out.println(canWinNim(4));
    }
}
