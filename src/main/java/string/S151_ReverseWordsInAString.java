package string;

import java.util.ArrayList;

public class S151_ReverseWordsInAString {

	public String reverseWords(String s) {
		if(s==null || s.length()==0)
			return s;
		String[] strs = s.trim().split(" ");
		StringBuilder sb = new StringBuilder("");
		for(int i=strs.length-1;i>=0;i--){
			if("".equals(strs[i]))
				continue;
			sb.append(strs[i]);
			sb.append(" ");
		}
		return sb.toString().trim();
	}






























	public String reverseWords0(String s) {
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
