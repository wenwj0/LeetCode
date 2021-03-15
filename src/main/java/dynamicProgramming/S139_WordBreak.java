package dynamicProgramming;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class S139_WordBreak {
    public static void main(String[] args) {
        S139_WordBreak s139_wordBreak = new S139_WordBreak();
        String s = "applepenapple";
        List<String> wordDict = new LinkedList<>();
        wordDict.add("apple");
        wordDict.add("pen");
        System.out.println(s139_wordBreak.wordBreak(s, wordDict));
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        if (s == null || s.length() == 0 || wordDict.size() == 0)
            return false;
        Set<String> set = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j + i < s.length(); j++) {
                if (set.contains(s.substring(i, i + j + 1))) {
                    if (i==0){
                        dp[i+j] = true;
                    }else if(dp[i-1]){
                        dp[i+j] = true;
                    }
                    if (i+j==s.length()-1&&dp[i+j])
                        return true;
                }
            }
        }
        return false;
    }

    public boolean wordBreak0(String s, List<String> wordDict) {
        if (s == null || s.length() == 0 || wordDict.size() == 0)
            return false;
        boolean[] dp = new boolean[s.length() + 1];
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < wordDict.size(); j++) {
                String word = wordDict.get(j);
                int left = i - word.length();
                if (left >= 0) {
                    if (s.substring(left, i).equals(word)) {
                        if (left == 0) {
                            dp[i] = true;
                        } else if (dp[left]) {
                            dp[i] = true;
                        }
                    }
                }
            }
        }
        return dp[s.length()];
    }
}
