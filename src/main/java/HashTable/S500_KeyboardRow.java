package HashTable;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class S500_KeyboardRow {
    public static void main(String[] args) {
        S500_KeyboardRow test = new S500_KeyboardRow();
        String[] res = test.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"});
        for (String r : res) {
            System.out.println(r);
        }
    }

    public String[] findWords(String[] words) {
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < rows.length; i++) {
            String row = rows[i];
            char[] c = row.toCharArray();
            for (int j = 0; j < c.length; j++) {
                map.put(c[j], i);
            }
        }
        List<String> list = new LinkedList<>();
        for (int i = 0; i < words.length; i++) {
            char[] word = words[i].toLowerCase().toCharArray();
            int j = 0;
            int pre = map.get(word[0]);
            for (j = 1; j < word.length; j++) {
                if (map.get(word[j]) != pre) {
                    break;
                }
            }
            if (j >= word.length) {
                list.add(words[i]);
            }
        }
        String[] res = new String[list.size()];
        res = list.toArray(res);
        return res;
    }
}
