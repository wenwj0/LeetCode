package java.byOrder;

public class S342_PowerOfFour {
    public boolean isPowerOfFour(int num) {
        if(num<=1)
            return false;
        if((num&(num-1))!=0)
            return false;
        int cnt = 0;
        for(int i=0;i<32;i++){
            if(num==0)
                break;
            else
                cnt++;
            num = num>>1;
        }
        return (cnt&1)==1;
    }
    /*
        别人答案
        因此 4 的幂与数字 (101010...10)向与会得到 0。
        即 4^a ^ (101010...10) = 0
        (101010...10)用十六进制表示为 ：(aaaaaaaa)
     */
    public boolean isPowerOfFour1(int num) {
        return (num > 0) && ((num & (num - 1)) == 0) && ((num & 0xaaaaaaaa) == 0);
    }

    public static void main(String[] args) {
        System.out.println(new S342_PowerOfFour().isPowerOfFour(5));
    }
}
