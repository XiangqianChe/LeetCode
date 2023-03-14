/**
 * 用栈实现队列
 */
import java.util.Stack;

public class L0232_ImplementQueueUsingStacks {
    private final Stack<Integer> s1, s2;

    public L0232_ImplementQueueUsingStacks() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        while (!s1.empty()) s2.push(s1.pop()); // 将数据从s1依次放入s2，反序
        s2.add(x); // 加入新元素到栈顶（后进）
        while (!s2.empty()) s1.push(s2.pop()); // 将数据从s2依次放入s1，再次正序，新元素在栈底（后出）
    }

    public int pop() {
        return s1.pop();
    }

    public int peek() {
        return s1.peek();
    }

    public boolean empty() {
        return s1.empty();
    }

    public static void main(String[] args) {
        L0232_ImplementQueueUsingStacks queue = new L0232_ImplementQueueUsingStacks();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.empty());
    }
}
