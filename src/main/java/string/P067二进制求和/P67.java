package java.string.P067二进制求和;

public class P67 {
    public String addBinary(String a, String b) {
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
