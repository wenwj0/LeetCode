package dynamicProgramming;

public class S1143_LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        char[] char1 = text1.toCharArray();
        char[] char2 = text2.toCharArray();
        for (int i = 0; i <= text1.length(); i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i <= text2.length(); i++) {
            dp[0][i] = 0;
        }
        for (int i = 0; i < text1.length(); i++) {
            for (int j = 0; j < text2.length(); j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                    continue;
                }
                if (char1[i] != char2[j]) {
                    dp[i + 1][j + 1] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                } else {
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }
}
