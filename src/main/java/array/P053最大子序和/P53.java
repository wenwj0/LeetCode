package java.array.P053最大子序和;

import array.Interval;

public class P53 {
	public int maxSubArray(int[] nums) {
		int len = nums.length;
		int maxn = nums[0];
		int temp = nums[0];
		for (int i=1;i<len;i++) {
			if(nums[i] + temp<nums[i]) {
				temp = nums[i];
			}else {
				temp = nums[i] + temp;
			}
			if(temp > maxn) {
				maxn = temp;
			}
		}

		return maxn; 
	}
}
