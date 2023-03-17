/**
 * 已知矩形面积，求长宽（长要大于宽，两者要尽量接近）
 */
import java.util.Arrays;

public class L0492_ConstructTheRectangle {
    public static int[] constructRectangle(int area) {
        int i = (int) Math.sqrt(area); // 为了让长宽接近，从平方根开始向下尝试
        while (area % i != 0) {
            i--;
        }
        return new int[]{area / i, i}; // 依次返回长宽（长大于宽）
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(constructRectangle(37)));
    }
}
