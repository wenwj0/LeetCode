package string;

public class S125_ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] str = s.toCharArray();
        int k=0;
        for(int i=0;i<s.length();i++) {
            if(Character.isLetterOrDigit(str[i])) {
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
    public boolean isPalindrome0(String s) {
        if (s == null || s.length() == 0)
            return true;
        int left = 0;
        int right = s.length() - 1;
        s = s.toLowerCase();
        char[] c = s.toCharArray();
        while (left < right) {
            while (left < s.length() && !Character.isLetterOrDigit(c[left]))
                left++;
            while (right >= 0 && !Character.isLetterOrDigit(c[right]))
                right--;
            if (left >= s.length() || right < 0)
                break;
            if (left != right && c[left] != c[right])
                return false;
            left++;
            right--;
        }
        return true;
    }
}
