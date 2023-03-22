/**
 * 判断一个正整数是否完美（其所有因子之和等于它本身，如28=1+2+4+7+14）
 */
public class L0507_PerfectNumber {
    public static boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i * i <= num; i++) { // 从1开始寻找所有因子直到平方根，这样迭代次数较少
            if (num % i == 0) { // 找到因子i后加入
                sum += i;
                if (i != num / i) { // num/i也是因子，只要与i不同也加入
                    sum += num / i;
                }
            }
        }
        return sum - num == num; // 最后sum中会多出num本身（num自己也是num的因子），减去后比较
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            if (checkPerfectNumber(i)) {
                System.out.println(i);
            }
        }
    }
}
