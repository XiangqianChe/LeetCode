/**
 * 从1开始报数，逢3的倍数报Fizz，逢5的倍数报Buzz，同时报FizzBuzz，求从1报到n的结果
 */
import java.util.ArrayList;
import java.util.List;

public class L0412_FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> ret = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                ret.add("FizzBuzz");
            } else if (i % 3 == 0) {
                ret.add("Fizz");
            } else if (i % 5 == 0) {
                ret.add("Buzz");
            } else {
                ret.add(i + "");
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }
}
