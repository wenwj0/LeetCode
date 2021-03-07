package array;

public class S287_FindTheDuplicateNumber {
	public int findDiplicate(int[] nums) {
		int left=1,right = nums.length;
		while (left<=right) {
			int mid = left + (right - left) / 2;
			int s = 0,l=0,m=0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] > mid)
					l++;
				else if(nums[i] < mid)
					s++;
				else
					m++;
			}
			if(s==l)
				return mid;
			else if(m>1)
				return mid;
			else if(s<l)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return left;
	}
}
