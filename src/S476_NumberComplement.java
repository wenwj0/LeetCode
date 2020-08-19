public class S476_NumberComplement {
    public int findComplement(int num) {
        int tmp = 1;
        while(tmp<num){
            tmp <<= 1;
            tmp += 1;
        }
        return tmp ^ num;
    }

    public static void main(String[] args) {
        System.out.println(new S476_NumberComplement().findComplement(5));
    }
}
