import java.util.Arrays;

public class S5809 {
    public static void main(String[] args) {
        S5809 test = new S5809();
        System.out.println(test.countPalindromicSubsequence("aabca"));
        System.out.println(test.countPalindromicSubsequence("bbcbaba"));
        System.out.println(test.countPalindromicSubsequence("adc"));
    }

    public int countPalindromicSubsequence(String s) {
        int res = 0;
        char[] chars = s.toCharArray();
        int[][] minMax = new int[26][2];
        for (int i = 0; i < 26; i++) {
            minMax[i][0] = Integer.MAX_VALUE;
        }
        int[] cntAlpha = new int[26];
        for (int i = 0; i < chars.length; i++) {
            int alpha = chars[i] - 'a';
            cntAlpha[alpha]++;
            minMax[alpha][0] = Math.min(minMax[alpha][0], i);
            minMax[alpha][1] = Math.max(minMax[alpha][1], i);
        }
        for (int i = 0; i < 26; i++) {
            if (cntAlpha[i] > 1) {
                boolean[] useAlpha = new boolean[26];
                int left = minMax[i][0];
                int right = minMax[i][1];
                for (int l = left + 1; l < right; l++) {
                    int alpht = chars[l] - 'a';
                    if (!useAlpha[alpht]) {
                        useAlpha[alpht] = true;
                        res++;
                    }
                }
            }
        }
        return res;
    }

}