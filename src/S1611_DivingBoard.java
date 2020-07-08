import java.util.*;

public class S1611_DivingBoard {
    public int[] divingBoard(int shorter, int longer, int k){
        if(k==0)
            return new int[0];
        if(shorter==longer){
            return new int[]{shorter * k};
        }
        int[] res = new int[k+1];
        for(int i=0;i<=k;i++){
            res[i] = i * longer + (k-i) * shorter;
        }
        return res;
    }

    public static void main(String[] args) {
        int shorter = 1;
        int longer = 2;
        int k = 3;
        int[] res = new S1611_DivingBoard().divingBoard(shorter,longer,k);
        System.out.println();
    }
}
