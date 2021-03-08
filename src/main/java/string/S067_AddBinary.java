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
    public String addBinary2(String a, String b) {
        char[] charA = a.toCharArray();
        char[] charB = b.toCharArray();
        int lenA = charA.length-1;
        int lenB = charB.length-1;
        int tmp = 0;
        StringBuilder sb = new StringBuilder();
        while(lenA>=0 || lenB>=0){
            int numA = lenA>=0?charA[lenA]-'0':0;
            int numB = lenB>=0?charB[lenB]-'0':0;
            int res = numA + numB + tmp;
            tmp = res / 2;
            sb.append(res%2);
            lenA--;
            lenB--;
        }
        if(tmp!=0)
            sb.append(tmp);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        S067_AddBinary s067_addBinary = new S067_AddBinary();
        System.out.println(s067_addBinary.addBinary2("11","1"));
    }
}
