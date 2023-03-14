/**
 * 已知连续几日的股价，求择日买进卖出（可以多次）的最大收益
 */
public class L0122_BestTimeToBuyAndSellStockII {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        // 只要后一天比前一天股价高，就买进卖出一次，以尽可能获得收益
        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] < prices[i]) profit += prices[i] - prices[i - 1];
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
