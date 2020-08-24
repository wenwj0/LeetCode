package java.byOrder;

public class S009_PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;
        int reverseNum = 0;
        while (x > reverseNum) {
            reverseNum = reverseNum * 10 + x % 10;
            x /= 10;
        }
        return x == reverseNum || x == reverseNum / 10;
    }

    public boolean isPalindrome1(int x) {
        if (x < 0) return false;
        if (x == reverse(x))
            return true;
        return false;
    }

    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        return res;
    }

    public boolean isPalindrome2(int x) {
        String str = String.valueOf(x);
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
