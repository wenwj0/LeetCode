package string;

import java.util.ArrayList;

public class S151_ReverseWordsInAString {
	public static void main(String[] args) {
		S151_ReverseWordsInAString s151_reverseWordsInAString = new S151_ReverseWordsInAString();
		System.out.println(s151_reverseWordsInAString.reverseWords1("Alice does not even like bob"));
	}
	public String reverseWords1(String s) {
		if (s==null || s.isEmpty()){
			return s;
		}
		s = s.trim();
		if (s.length()==0){
			return s;
		}
		char[] chars = s.toCharArray();
		int i = 0,j=0;
		while(i<s.length()){
			if (chars[i]==' '&&i+1<s.length()&&chars[i+1]==' '){
				i++;
			}else {
				chars[j++] = chars[i++];
			}
		}
		int left = 0,right = 0;
		swap(chars,0,j-1);
		for (i=0;i<j;i++){
			if (chars[i]==' '){
				right = i-1;
				swap(chars,left,right);
				left = i+1;
			}
		}
		if (left<j){
			swap(chars,left,j-1);
		}
		StringBuilder sb = new StringBuilder();
		for (i=0;i<j;i++){
			sb.append(chars[i]);
		}
		return sb.toString();
	}
	public void swap(char[] array, int left, int right){
		while(left<right){
			char temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			left++;right--;
		}
	}
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
