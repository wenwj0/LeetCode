package java.array.P034在排序数组中查找元素的第一个和最后一个位置;

public class P34 {
	public int[] searchRange(int[] nums,int target) {
		int left=0,right = nums.length-1;
		int index=-1,l=-1,r=-1;
		int[] res = {l,r};
		while(left<=right) {
			int mid = left + (right - left)/2;
			if(nums[mid]==target) {
				index= mid;
				break;
			}else if(nums[mid]<target)
				left = mid + 1;
			else
				right = mid - 1;
		}
		int temp = index;
		if(index!=-1)
			r=l=index;
		else
			return res;
		while(index+1<nums.length && nums[++index]==target)
			r=index;
		while(temp-1>=0&&nums[--temp]==target)
			l=temp;
		res[0]=l;
		res[1]=r;
		return res;
	}
}
