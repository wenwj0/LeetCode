package leetcode;

import java.util.ArrayList;

public class P151 {

	public String reverseWords(String s) {
		String[] strings1 = s.split(" ");
		ArrayList<String> strings = new ArrayList<>();
		for (String item : strings1) {
			if (!item.equals(""))
				strings.add(item);
		}
		String temp;
		int length = strings.size();
		for (int i = 0; i < length / 2; i++) {
			temp = strings.get(length - i - 1);
			strings.set(length - i - 1, strings.get(i));
			strings.set(i, temp);
		}
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < length; i++) {
			stringBuilder.append(strings.get(i));
			if (i != length - 1) {
				stringBuilder.append(" ");
			}
		}
		return stringBuilder.toString();
	}

}
