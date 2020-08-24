package java.array.P056合拼区间;

import java.array.Interval;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class P56 {
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
