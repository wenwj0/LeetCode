package array;

import java.util.LinkedList;
import java.util.List;

public class S054_SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new LinkedList<>();
        if(matrix==null || matrix.length==0)
            return list;
        if(matrix.length==1)
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
