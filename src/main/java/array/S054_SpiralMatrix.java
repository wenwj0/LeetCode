package array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class S054_SpiralMatrix {
    public static void main(String[] args) {
//        int[][] matrix = {{1, 2, 3,4}, { 5, 6,7, 8},{9,10,11,12}};
//        int[][] matrix = {{6,9,7}};
        int[][] matrix = {{1},{2}};
        S054_SpiralMatrix s054_spiralMatrix = new S054_SpiralMatrix();
        List<Integer> res = s054_spiralMatrix.spiralOrder(matrix);
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new LinkedList<>();
        if (matrix == null || matrix.length == 0)
            return res;
        int a = 0, b = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int c = m - 1;
        int d = n - 1;
        while (a <= c && b <= d) {
            res.addAll(spiralAround(matrix, a,b, c, d));
            a++;
            b++;
            c--;
            d--;
        }
        return res;

    }

    public List<Integer> spiralAround(int[][] matrix, int a, int b, int c, int d) {
        List<Integer> res = new LinkedList<>();
        int left = b ;
        int up = a;
        if (a==c){//hang
            while(left<=d)
                res.add(matrix[a][left++]);
        }else if (b==d){//lie
            while(up<=c)
                res.add(matrix[up++][d]);
        }else {
            while (left < d) {
                res.add(matrix[a][left++]);
            }
            while (up < c) {
                res.add(matrix[up++][d]);
            }
            while (left > b) {
                res.add(matrix[c][left--]);
            }
            while (up > a) {
                res.add(matrix[up--][b]);
            }
        }
        return res;
    }


    public List<Integer> spiralOrder0(int[][] matrix) {
        List<Integer> list = new LinkedList<>();
        if (matrix == null || matrix.length == 0)
            return list;
        if (matrix.length == 1)
            return list;
        int left = 0;
        int right = matrix[0].length - 1;
        int up = 0;
        int low = matrix.length - 1;
        int cnt = 0;
        int total = matrix.length * matrix[0].length;

        while (cnt < total) {
            for (int i = left; i <= right && cnt < total; i++, cnt++) {
                list.add(matrix[up][i]);
            }
            up++;
            for (int i = up; i <= low && cnt < total; i++, cnt++) {
                list.add(matrix[i][right]);
            }
            right--;
            for (int i = right; i >= left && cnt < total; i--, cnt++) {
                list.add(matrix[low][i]);
            }
            low--;
            for (int i = low; i >= up && cnt < total; i--, cnt++) {
                list.add(matrix[i][left]);
            }
            left++;
        }
        return list;
    }
}
