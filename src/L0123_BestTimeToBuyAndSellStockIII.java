/**
 * 已知连续几日的股价，求择日买进卖出两次的最大收益（第二次买进必须在第一次卖出之后）
 */
public class L0123_BestTimeToBuyAndSellStockIII {
    public static int maxProfit(int[] prices) {
        int buy1 = prices[0], sell1 = 0;
        int buy2 = prices[0], sell2 = 0;

        for (int price : prices) {
            buy1 = Math.min(buy1, price); // 第一次买入价，越低越好
            sell1 = Math.max(sell1, price - buy1); // 第一次卖出后收益，越高越好
            buy2 = Math.min(buy2, price - sell1); // 用第一次收益折算后的买入价，越低越好
            sell2 = Math.max(sell2, price - buy2); // 第二次卖出后收益，越高越好
        }
        return sell2;
    }

    public static void main(String[] args) {
        int[] prices = {3,3,5,0,0,3,1,4};
        System.out.println(maxProfit(prices));
    }
}
