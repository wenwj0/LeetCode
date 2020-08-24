//反转字符串中的单词 III
public class P557 {
	public String reverseWords(String s) {
		char[] chars = s.toCharArray();
		int i=0,j=0;
		while(i<s.length()&&j<s.length()) {
			if(j+1==s.length()||chars[j+1]==' ') {
				reverse(chars,i,j);
				i=j+2;j=i;
			}else {
				j++;
				
			}
		}
		return new String(chars);
	}
	void reverse(char[] chars,int left,int right) {
		while(left<right) {
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;
			left++;right--;
		}
		
	
	}
	
}
