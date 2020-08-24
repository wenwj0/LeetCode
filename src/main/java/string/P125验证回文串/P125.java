package java.string.P125验证回文串;

public class P125 {
	public boolean isPalindrome(String s) {
		char[] str = s.toCharArray();
		int k=0;
		for(int i=0;i<s.length();i++) {
			if((str[i]>='A'&&str[i]<='Z') ||(str[i]>='a'&&str[i]<='z')|| (str[i]>='0'&&str[i]<='9')) {
				if(str[i]<='Z')
					str[i] += 'a'-'A';
				str[k++]=str[i];
			}
		}
		int i=0,j=k-1;
		while(i<j) {
			if(str[i]!=str[j])
				return false;
			i++;j--;
		}
		return true;
	}
}
