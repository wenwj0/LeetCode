package java.byOrder;

public class S190_ReverseBits {
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res = (res<<1) + (n&1);
            n>>=1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new S190_ReverseBits().reverseBits(43261596));
//        int a = 00010;
//        System.out.println(a);
    }
}
