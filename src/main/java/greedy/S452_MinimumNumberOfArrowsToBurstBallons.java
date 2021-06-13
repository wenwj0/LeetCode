package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class S452_MinimumNumberOfArrowsToBurstBallons {
    public static void main(String[] args) {
        S452_MinimumNumberOfArrowsToBurstBallons test = new S452_MinimumNumberOfArrowsToBurstBallons();
        int[][] input = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        int[][] input1 = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int[][] input2 = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        int[][] input3 = {{Integer.MIN_VALUE, 1}};
        int[][] input4 = {{-2147483646, -2147483645}, {2147483646, 2147483647}};
        System.out.println(test.findMinArrowShots(input));
        System.out.println(test.findMinArrowShots(input1));
        System.out.println(test.findMinArrowShots(input2));
        System.out.println(test.findMinArrowShots(input3));
        System.out.println(test.findMinArrowShots(input4));
    }

    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] > o2[0]) {
                    return 1;
                } else if (o1[0] < o2[0]) {
                    return -1;
                } else {
                    if (o1[1] < o2[1]) {
                        return -1;
                    } else if (o1[1] > o2[1]) {
                        return 1;
                    }
                    return 0;
                }
            }
        });
        int cnt = points[0][0] == Integer.MIN_VALUE ? 1 : 0;
        int right = Integer.MIN_VALUE;
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] > right) {
                right = points[i][1];
                cnt++;
            } else if (points[i][1] < right) {
                right = points[i][1];
            }
        }
        return cnt;
    }
}
