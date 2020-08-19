public class S461_HammingDistance {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int cnt = 0;
        while(z!=0){
            z = z & (z-1);
            cnt ++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(new S461_HammingDistance().hammingDistance(1,4));
    }
}
