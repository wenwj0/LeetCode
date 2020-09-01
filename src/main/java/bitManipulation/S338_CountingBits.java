package bitManipulation;

public class S338_CountingBits {
    public int[] countBits(int num){
        int[] res = new int[num+1];
        for(int i=0;i<=num;i++){
            res[i] = res[i>>2]+(i&1);
        }
        return res;
    }
}
