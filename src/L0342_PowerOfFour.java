public class L0342_PowerOfFour {
    public static boolean isPowerOfFour(int n) {
        if (n < 1) return false;
        while (n % 4 == 0) // 除4能除尽，最后等于1
            n /= 4;
        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
    }

}
