/**
 * 将n个金币按照三角形从上向下排列，能排列成的完整行有几行
 */
public class L0441_ArrangingCoins {
    public static int arrangeCoins(int n) {
        int i = 0;
        while (n > i) { // 剩余金币数大于当前行数（当前行金币数）才能形成新的完整行，否则新行不完整
            i++; // 行数
            n -= i; // 剩余金币数
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(1));
        System.out.println(arrangeCoins(2));
        System.out.println(arrangeCoins(3));
        System.out.println(arrangeCoins(4));
        System.out.println(arrangeCoins(5));
        System.out.println(arrangeCoins(6));
        System.out.println(arrangeCoins(7));
        System.out.println(arrangeCoins(8));
        System.out.println(arrangeCoins(9));
        System.out.println(arrangeCoins(10));
    }
}
