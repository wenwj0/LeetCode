package array;

import java.util.Arrays;
import java.util.PriorityQueue;

public class S378_KthSmallestElementInASortedMatrix {
    public static void main(String[] args) {
        S378_KthSmallestElementInASortedMatrix test = new S378_KthSmallestElementInASortedMatrix();
        System.out.println(test.kthSmallest(new int[][]{{1,5,9},{10,11,13},{12,13,15}},1));
        System.out.println(test.kthSmallest(new int[][]{{-5}},1));
    }
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Row> queue = new PriorityQueue();

        for (int i = 0; i < matrix.length; i++) {
            queue.offer(new Row(0, matrix[i]));
        }
        int cnt = 0;
        while (++cnt < k) {
            Row peek = queue.poll();
            if (peek.index + 1 < peek.len) {
                queue.offer(new Row(peek.index + 1, peek.matrix ));
            }
        }
        return queue.peek().num;
    }
}

class Row implements Comparable<Row> {
    int num;
    int index;
    int len;
    int[] matrix;

    Row(int index, int[] matrix) {
        this.index = index;
        this.matrix = matrix;
        this.num = matrix[index];
        this.len = matrix.length;
    }

    @Override
    public int compareTo(Row o) {
        return this.num - o.num;
    }
}
