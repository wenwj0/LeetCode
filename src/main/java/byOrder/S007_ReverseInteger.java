package java.byOrder;

public class S007_ReverseInteger {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public int reverse1(int x) {
        boolean flag = x<0?false:true;
        x *= x<0? -1:1;
        int res = 0;
        while(x>0){
            if(res>Integer.MAX_VALUE/10)
                return 0;
            res *=10;
            res += x % 10;
            x /=10;
        }
        return flag?res:res*-1;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(new S007_ReverseInteger().reverse(120));
    }
}
