package array;

import linkedList.ListNode;

import java.util.*;

public class P56 {
    public int[][] merge1(int[][] intervals) {
        int left = intervals[0][0];
        int right = intervals[0][1];
        List<int[]> res = new LinkedList<>();
        for (int i = 1; i < intervals.length; i++) {
            int l = intervals[i][0];
            int r = intervals[i][1];
            if (l > right || i == intervals.length - 1) {
                int[] tempInterval = new int[2];
                tempInterval[0] = left;
                tempInterval[1] = right;
                left = l;
                right = r;
                res.add(tempInterval);
            } else {
                right = r;
            }
        }
        int[][] resIntervals = new int[res.size()][];
        for (int i = 0; i < res.size(); i++) {
            resIntervals[i] = res.get(i);
        }
        return resIntervals;
    }


    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() <= 1)
            return intervals;
        Collections.sort(intervals, new Comparator<Interval>() {

            @Override
            public int compare(Interval o1, Interval o2) {
                if (o1.start > o2.start)
                    return 1;
                else if (o1.start == o2.start)
                    return 0;
                else
                    return -1;
            }
        });
        List<Interval> result = new LinkedList<Interval>();
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;

        for (Interval interval : intervals) {
            if (interval.start <= end) {
                end = interval.end > end ? interval.end : end;
            } else {
                result.add(new Interval(start, end));
                start = interval.start;
                end = interval.end;
            }
        }
        result.add(new Interval(start, end));
        return result;
    }
}
