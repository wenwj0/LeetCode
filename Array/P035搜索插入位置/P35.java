package leetcodeTest;

public class P35 {
	public int searchInsert(int[] nums,int target) {
		int left=0,right = nums.length;
		if(target<nums[0])
			return 0;
		if(target>nums[right-1])
			return right;
		while(left<=right) {
			int mid= left + (right - left)/2;
			if(nums[mid]==target)
				return mid;
			else if(target<nums[mid]) {
				if(mid-1>0 && target>nums[mid-1])
					return mid-1;
				right = mid - 1;
			}else {
				if(mid+1<nums.length && target<nums[mid+1])
					return mid+1;
				left = mid + 1;
			}
		}
		return 0;
	}
}
