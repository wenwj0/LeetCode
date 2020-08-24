package java.array.P154寻找旋转排序数组中的最小值Ⅱ;

public class P154 {
	public int findMin(int[] nums) {
		int left=0,right=nums.length-1;
		if(nums[left]<=nums[right])
			return nums[left];
		
		while(left<=right) {
			int mid = left + (right - left)/2;
			if(mid-1>=0&&mid+1<nums.length && nums[mid]<=nums[mid-1] && nums[mid]<=nums[mid+1])
				return nums[mid];
			if(nums[mid]>=nums[right]&&nums[mid]>=nums[left]) {
				left = mid + 1;
			}else 
				right = mid - 1;
		}
		if(nums[0]>nums[1])
			return nums[1];
		
		return nums[nums.length-1];
	}
}
