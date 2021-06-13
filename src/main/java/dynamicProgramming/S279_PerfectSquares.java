package dynamicProgramming;

public class S279_PerfectSquares {
    public static void main(String[] args) {
        S279_PerfectSquares test = new S279_PerfectSquares();
        System.out.println(test.numSquares(12));
        System.out.println(test.numSquares(13));
    }

    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                min = Math.min(dp[i - j * j], min);
            }
            dp[i] = min + 1;
        }
        return dp[n];
    }
}
