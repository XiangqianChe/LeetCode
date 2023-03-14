/**
 * 已知连续几日的股价，求择日买进卖出一次的最大收益
 */
public class L0121_BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int minPrice = prices[0], maxProfit = 0;
        for (int i = 1; i < prices.length; i++) { // 逐日比较
            minPrice = Math.min(minPrice, prices[i]); // 更新当前最低股价（买入价）
            maxProfit = Math.max(maxProfit, prices[i] - minPrice); // 比较当天卖出的收益与历史最高收益，更新历史最高收益
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
