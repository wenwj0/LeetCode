import java.util.Arrays;

public class S274_HIndex {
    public static void main(String[] args) {
        S274_HIndex test = new S274_HIndex();
        System.out.println(test.hIndex(new int[]{3, 0, 6, 1, 5}));
        System.out.println(test.hIndex(new int[]{1, 3, 1}));
        System.out.println(test.hIndex(new int[]{0, 0, 0}));
        System.out.println(test.hIndex(new int[]{3, 3, 3}));
        System.out.println(test.hIndex(new int[]{2, 2, 2}));
        System.out.println(test.hIndex(new int[]{4, 4, 4}));
        System.out.println(test.hIndex(new int[]{1}));
        System.out.println(test.hIndex(new int[]{0}));
    }

    public int hIndex(int[] citations) {
        int m = citations.length;
        Arrays.sort(citations);
        int res = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            int cnt = m - i;
            if (cnt <= citations[i]) {
                res = cnt;
            }
        }
        return res;
    }
}
