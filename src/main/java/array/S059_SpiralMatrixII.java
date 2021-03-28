package array;

public class S059_SpiralMatrixII {
    public static void main(String[] args) {
        S059_SpiralMatrixII s059_spiralMatrixII = new S059_SpiralMatrixII();
        s059_spiralMatrixII.generateMatrix(3);
    }
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int start = 1;
        for (int i = 0; i < (n + 1) / 2; i++) {
            start = generate(res, i, n - i - 1, i, n - i - 1, start);
        }
        return res;
    }

    public int generate(int[][] num, int up, int low, int left, int right, int n) {
        if (low==up){
            for (int i=left;i<=right;i++)
                num[up][i] = n++;
            return n;
        }
        for (int i = left; i < right; i++) {
            num[up][i] = n++;
        }
        for (int i = up; i < low; i++) {
            num[i][right] = n++;
        }
        for (int i = right; i > left; i--) {
            num[low][i] = n++;
        }
        for (int i = low; i > up; i--) {
            num[i][left] = n++;
        }
        return n;
    }
}
