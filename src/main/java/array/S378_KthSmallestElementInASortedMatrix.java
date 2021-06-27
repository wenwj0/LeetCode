package array;

import java.util.Arrays;

public class S378_KthSmallestElementInASortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        int[] res = new int[k];
        Arrays.fill(res, Integer.MAX_VALUE);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

            }
        }
        return res[0];
    }

    public void insert(int[] matrix, int num) {
        int len = matrix.length;
        int index = len - 1;
        while (num < matrix[index]) {
            matrix[index] = num;
            index = index / 2 - 1;
        }
    }
}
