package string;

public class S387_FirstUniqueCharacterInAString {
	public int firstUniqChar0(String s) {
		int[] map = new int[26];
		for(int i=0;i<s.length();i++) {
			map[s.charAt(i)-'a']++;
		}
		int i = 0;
		while(i<s.length()) {
			if(map[s.charAt(i)-'a']==1)
				return i;
			i++;
		}
		
		return -1;
	}
}
