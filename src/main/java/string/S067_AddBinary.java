package string;

public class S067_AddBinary {
    /**
     * Leetcode Answer
     * @param a
     * @param b
     * @return
     */
    public String addBinary(String a, String b) {
        StringBuffer ans = new StringBuffer();

        int n = Math.max(a.length(), b.length()), carry = 0;
        for (int i = 0; i < n; ++i) {
            carry += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
            carry += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
            ans.append((char) (carry % 2 + '0'));
            carry /= 2;
        }

        if (carry > 0) {
            ans.append('1');
        }
        ans.reverse();

        return ans.toString();
    }

    public String addBinary1(String a, String b) {
        StringBuilder c = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i>=0 || j>=0 ) {
        	int sum = carry;
        	if(i>=0) {
        		sum += a.charAt(i--)-'0';
        	}
        	if(j>=0) {
        		sum += b.charAt(j--)-'0';
        	}
        	c.append(sum % 2);
        	carry = sum /2;        
        }
        if(carry!=0) {
        	c.append(carry);
        }
        return c.reverse().toString();
    }
}
