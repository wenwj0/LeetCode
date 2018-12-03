package leetcodeTest;

import java.util.Arrays;

public class P16 {
	public int threeSumClosest(int[] nums, int target) {
		if (nums.length == 3)
			return nums[0] + nums[1] + nums[2];
		Arrays.sort(nums);
		int tempSum = nums[0] + nums[1] + nums[2];
		int del = Math.abs(tempSum-target);
		int result = tempSum;
		for (int i = 0; i < nums.length - 2; i++) {
			int left = i + 1, right = nums.length - 1;
			while (left < right) {
				tempSum = nums[i] + nums[left] + nums[right];
				int tempDel = Math.abs(tempSum-target);
				if (tempDel < del) {
					del = tempDel;
					result = tempSum;
				}
				if(result == target)
					return result;
				else if(tempSum<target)
					left++;
				else
					right--;
			}
		}
		return result;
	}
}
