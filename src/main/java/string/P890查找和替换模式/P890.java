package java.string.P890查找和替换模式;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class P890 {
	public List<String> findAndReplacePattern(String[] words, String pattern) {
		List<String> res = new LinkedList<>();
		int[] newPattern = change(pattern);
		for (String word : words) {
			if (Arrays.equals(newPattern,change(word))) {
				res.add(word);
			}
		}
		return res;
	}

	private int[] change(String word) {
		HashMap<Character,Integer> h = new HashMap<>(); 
		int len = word.length();
		int[] res = new int[len];
		for (int i = 0; i < word.length(); i++) {
			h.putIfAbsent(word.charAt(i), h.size());
			res[i] = h.get(word.charAt(i));
		}
		return res;
	}
}
