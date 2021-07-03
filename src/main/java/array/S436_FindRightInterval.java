package array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class S436_FindRightInterval {
    public static void main(String[] args) {
        S436_FindRightInterval test = new S436_FindRightInterval();
//        int[] res = test.findRightInterval(new int[][]{{1, 4}, {2, 3}, {3, 4}});
//        int[] res = test.findRightInterval(new int[][]{{3, 4}, {2, 3}, {1, 2}});
        int[] res = test.findRightInterval(new int[][]{{1,1},{3, 4}});
        for (int i : res) {
            System.out.println(i);
        }

    }

    public int[] findRightInterval(int[][] intervals) {
        int[] res = new int[intervals.length];
        Arrays.fill(res, -1);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < intervals.length; i++) {
            int left = intervals[i][0];
            map.put(left, i);
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0])
                    return o1[0] - o2[0];
                else
                    return o1[1] - o2[1];
            }
        });
        for (int i = 0; i < intervals.length; i++) {
            int curLeft = intervals[i][0];
            int curIndex = map.get(curLeft);
            for (int j = i; j < intervals.length; j++) {
                int nextLeft = intervals[j][0];
                int curRight = intervals[i][1];
                if (nextLeft < curRight) {
                    continue;
                } else {
                    res[curIndex] = map.get(nextLeft);
                    break;
                }
            }
        }
        return res;
    }
}
