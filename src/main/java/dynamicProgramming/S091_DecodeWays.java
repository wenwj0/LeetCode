package dynamicProgramming;

import java.util.Locale;

public class S091_DecodeWays {
    public static void main(String[] args) {
        S091_DecodeWays test = new S091_DecodeWays();
        System.out.println(test.numDecodings("2201"));
    }

    public int numDecodings(String s) {
        if (s == null || s.length() == 0)
            return 0;
        char[] chars = s.toCharArray();
        if (chars[0] == '0')
            return 0;
        if (chars.length == 1) {
            return 1;
        }
        int[] dp = new int[s.length()];
        dp[0] = 1;
        if (chars[1] == '0') {
            if (chars[0] > '2') {
                return 0;
            } else {
                dp[1] = 1;
            }
        } else {
            if (chars[0] == '2' && chars[1] <= '6' || chars[0] == '1') {
                dp[1] = 2;
            } else {
                dp[1] = 1;
            }
        }
        for (int i = 2; i < chars.length; i++) {
            if (chars[i] == '0') {
                if (chars[i - 1] == '1' || chars[i - 1] == '2') {
                    dp[i] = dp[i - 2];
                } else {
                    return 0;
                }
            } else {
                if (chars[i - 1] == '1') {
                    dp[i] = dp[i - 1] + dp[i - 2];
                } else if (chars[i - 1] == '2' && chars[i] >= '1' && chars[i] <= '6') {
                    dp[i] = dp[i - 1] + dp[i - 2];
                } else {
                    dp[i] = dp[i - 1];
                }
            }
        }
        return dp[chars.length - 1];
    }
}
