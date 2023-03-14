/**
 * 求两个字符串形式的二进制数的和
 */
public class L0067_AddBinary {
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0, sum , i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 || j >= 0) { // 倒序循环
            sum = carry; // 先加前一轮的进位
            if (i >= 0) { // 用于保证在b结束时a继续进行循环求和
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) { // 用于保证在a结束时b继续进行循环求和
                sum += b.charAt(j--) - '0';
            }
            sb.append(sum % 2); // 倒序拼接
            carry = sum / 2; // 求进位
        }
        if (carry > 0) { // 和超出两数原有位数时向前进1
            sb.append(carry);
        }
        return sb.reverse().toString(); // 正序输出
    }

    public static void main(String[] args) {
        String a = "1010", b= "1011";
        System.out.println(addBinary(a,b));
    }
}
