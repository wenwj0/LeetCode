package leetcodeTest;

public class P33 {
	public int search(int[] nums, int target) {
		if (nums.length == 0)
			return -1;
		int left = 0, right = nums.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] == target)
				return mid;
			else if (nums[left] == target)
				return left;
			else if (nums[right] == target)
				return right;
			else {
				if (nums[mid] > target) { // 1,3,5
					if (nums[0] < target) // 1
						right = mid - 1;
					else {
						if (nums[0] < nums[mid])// 3
							left = mid + 1;
						else // 5
							right = mid - 1;
					}
				} else { // 2,4,6
					if (nums[0] < nums[mid]) // 2
						left = mid + 1;
					else { // 4,6
						if(target > nums[0])	//4
							right = mid - 1;
						else
							left = mid + 1;
					}
				}

			}
		}

		return -1;
	}
}
