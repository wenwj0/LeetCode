package array;

public class S121_BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        S121_BestTimeToBuyAndSellStock s121_bestTimeToBuyAndSellStock = new S121_BestTimeToBuyAndSellStock();
        System.out.println(s121_bestTimeToBuyAndSellStock.maxProfit(new int[]{
                7, 1, 5, 3, 6, 4
        }));
    }

    public int maxProfit(int[] prices) {
        int result = 0;
        int[] dp = new int[prices.length];
        dp[0] = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (dp[i - 1] < prices[i]) {
                result = Math.max(prices[i] - dp[i - 1], result);
                dp[i] = dp[i - 1];
            } else {
                dp[i] = prices[i];
            }
        }
        return result;
    }
}
