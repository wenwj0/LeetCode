package java.array.P018四数之和;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class P18 {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res = new LinkedList<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			int lo = i + 1, hi = nums.length - 1;
			int sum = -nums[i];
			while (lo < hi) {
				if (nums[lo] + nums[hi] == sum) {
					res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
					while (nums[lo] == nums[lo + 1])
						lo++;
					while (nums[hi] == nums[hi - 1])
						hi--;
				} else {
					lo++;
				}
			}
		}
		return res;
	}
}
