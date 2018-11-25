package leetcodeTest;

public class P81 {
	public boolean search(int[] nums,int target) {
		int left = 0,right = nums.length-1;
		while(left<=right) {
			int mid = left + (right - left)/2;
			if(nums[mid]==target || nums[left]==target || nums[right]==target)
				return true;
			if(nums[mid]==nums[left])
				left ++;
			else if(nums[mid]>nums[left]) {
				if(target>nums[mid]) {
					left = mid + 1;
				}else {
					if(target<nums[left])
						left = mid + 1;
					else
						right = mid - 1;
						
				}
			}else {
				if(target < nums[mid])
					right = mid -1;
				else {
					if(target<nums[left])
						left = mid + 1;
					else
						right = mid - 1;
				}
			}
		}
		return false;
	}
}
