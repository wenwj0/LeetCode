package leetcodeTest;

import java.util.LinkedList;
import java.util.List;

public class P442 {
	public List<Integer> findDuplicates(int[] nums) {
		List<Integer> res = new LinkedList<>();
		int[] temp = new int[nums.length + 1];
		for (int i = 0; i < nums.length; i++) {
			temp[nums[i]]++;
			if (temp[nums[i]] > 1 && temp[nums[i]] <= nums.length) {
				res.add(nums[i]);
				temp[nums[i]] += nums.length;
			}
		}
		return res;
	}
}
