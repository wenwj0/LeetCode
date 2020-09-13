package string;

import java.util.*;

public class S890_FindAndReplacePattern {
    /*
    Leetcode solution
     */
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList();
        for (String word: words)
            if (match(word, pattern))
                ans.add(word);
        return ans;
    }
    public boolean match(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if(s.indexOf(ch1[i]) != t.indexOf(ch2[i])){
                return false;
            }
        }
        return true;
    }
    public List<String> findAndReplacePattern1(String[] words, String pattern) {
        List<String> res = new LinkedList<>();
        if (words == null || words.length == 0)
            return res;
        for (String word : words) {
            boolean flag = true;
            Map<Character, Character> map = new HashMap<>();
            Map<Character, Character> map1 = new HashMap<>();
            char[] cWord = word.toCharArray();
            for (int i = 0; i < cWord.length; i++) {
                if (map.containsKey(pattern.charAt(i))) {
                    char c = map.get(pattern.charAt(i));
                    if (c != cWord[i]) {
                        flag = false;
                        break;
                    }
                } else {
                    if(map1.containsKey(cWord[i])){
                        flag = false;
                        break;
                    }
                    map.put(pattern.charAt(i), cWord[i]);
                    map1.put(cWord[i],pattern.charAt(i));
                }
            }
            if (flag)
                res.add(word);
        }
        return res;
    }


    public List<String> findAndReplacePattern0(String[] words, String pattern) {
        List<String> res = new LinkedList<>();
        int[] newPattern = change(pattern);
        for (String word : words) {
            if (Arrays.equals(newPattern, change(word))) {
                res.add(word);
            }
        }
        return res;
    }

    private int[] change(String word) {
        HashMap<Character, Integer> h = new HashMap<>();
        int len = word.length();
        int[] res = new int[len];
        for (int i = 0; i < word.length(); i++) {
            h.putIfAbsent(word.charAt(i), h.size());
            res[i] = h.get(word.charAt(i));
        }
        return res;
    }
}
