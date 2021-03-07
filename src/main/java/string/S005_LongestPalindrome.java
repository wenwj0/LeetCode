package string;

public class S005_LongestPalindrome {
    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        int max = Integer.MIN_VALUE;
        int left = 0;
        int right = 0;
        char[] chars = s.toCharArray();
        int n = s.length();
        boolean[][] dp = new boolean[n + 1][n + 1];
        for (int l = 0; l < n; l++) {
            for (int i = 0; i + l < n; i++) {
                int j = i + l;
                if (l == 0) {
                    dp[j][j] = true;
                } else if (l == 1 && chars[i] == chars[j]) {
                    dp[i][j] = true;
                } else {
                    if (dp[i + 1][j - 1] && chars[i] == chars[j]) {
                        dp[i][j] = true;
                    }
                }
                if (dp[i][j]){
                    if ((j-i)>max){
                        max = j-i;
                        left = i;
                        right = j+1;
                    }
                }
            }
        }
        return s.substring(left,right);
    }

    public static void main(String[] args) {
        S005_LongestPalindrome s005_longestPalindrome = new S005_LongestPalindrome();
        System.out.println(s005_longestPalindrome.longestPalindrome("ac"));

    }
}
