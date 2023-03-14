import java.util.Stack;

public class L0020_ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            // 遇左压右，遇右弹右（stack.pop()==c），则闭合
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) // 有开右)()或有开左()(
                return false;
        }
        return stack.isEmpty(); // 全闭合
    }

    public static void main(String[] args) {
        System.out.println(isValid("{[()]}"));
    }
}
