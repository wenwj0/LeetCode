package string;

public class S058_LengthOfLastWord {
	/**
	 * Leetcode Answer
	 * @param s
	 * @return
	 */
	public int lengthOfLastWord1(String s) {
		int end = s.length() - 1;
		while(end >= 0 && s.charAt(end) == ' ') end--;
		if(end < 0) return 0;
		int start = end;
		while(start >= 0 && s.charAt(start) != ' ') start--;
		return end - start;
	}

    public int lengthOfLastWord0(String s) {
    	if(s==null || s.length()==0)
    		return 0;
    	int len = s.length();
    	String[] strs = s.split(" ");
    	if(strs.length==0){
    		return 0;
		}
    	return strs[strs.length-1].length();
    }
    public int lengthOfLastWord(String s) {
		if(s==null || s.length()==0)
			return 0;
    	char[] c = s.toCharArray();
    	int right = c.length-1;
    	while(right>=0&&c[right]==' '){
    		right--;
		}
    	if(right<0)	return 0;
    	int left = right;
    	while(left>=0 && c[left]!=' '){
    		left--;
		}
    	return right - left;
	}
}
