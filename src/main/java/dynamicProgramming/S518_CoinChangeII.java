package dynamicProgramming;

public class S518_CoinChangeII {
    public static void main(String[] args) {
        S518_CoinChangeII test = new S518_CoinChangeII();
        System.out.println(test.change(5, new int[]{1, 2, 5}));
        System.out.println(test.change(500, new int[]{3, 5, 7, 8, 9, 10, 11}));
    }

    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                dp[j] += dp[j - coins[i]];
            }
        }
        return dp[amount];
    }

}
