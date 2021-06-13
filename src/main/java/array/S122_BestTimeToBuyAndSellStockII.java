package array;

public class S122_BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
        S122_BestTimeToBuyAndSellStockII test = new S122_BestTimeToBuyAndSellStockII();
        System.out.println(test.maxProfit(new int[]{
                7, 1, 5, 3, 6, 4
        }));
    }

    public int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                result += prices[i] - prices[i - 1];
            }
        }
        return result;
    }
}
