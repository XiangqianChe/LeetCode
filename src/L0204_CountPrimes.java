/**
 * 统计一个数以内（不含本数）所有质数的数量
 */
public class L0204_CountPrimes {
    public static int countPrimes(int n) {
        boolean[] isNotPrime = new boolean[n]; // 全为假
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!isNotPrime[i]) { // 从2开始，记录质数数量
                count++;
                for (int j = 2; i * j < n; j++) { // 将当前质数的倍数全部取真，即不是质数
                    isNotPrime[i * j] = true;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(20));
    }
}
