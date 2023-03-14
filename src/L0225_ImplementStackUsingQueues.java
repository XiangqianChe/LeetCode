/**
 * 用队列实现栈
 */
import java.util.LinkedList;
import java.util.Queue;

public class L0225_ImplementStackUsingQueues {

    final private Queue<Integer> q;

    public L0225_ImplementStackUsingQueues() {
        q = new LinkedList<>(); // Queue的实现类用LinkedList
    }

    public void push(int x) {
        q.add(x); // 新元素加到LinkedList最后
        for (int i = 1; i < q.size(); i++) { // 从头把之前的q.size()-1个元素依次全部放在新元素后
            q.add(q.remove());
        }
    }

    public int pop() {
        return q.remove(); // 从LinkedList的head移除
    }

    public int top() {
        return q.peek(); // 从LinkedList的head读取
    }

    public boolean empty() {
        return q.isEmpty();
    }

    public static void main(String[] args) {
        L0225_ImplementStackUsingQueues stack = new L0225_ImplementStackUsingQueues();
        stack.push(2);
        stack.push(2);
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
    }
}
