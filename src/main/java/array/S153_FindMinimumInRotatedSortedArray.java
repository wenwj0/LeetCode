package array;

public class S153_FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        if (nums[0] < nums[nums.length - 1])
            return nums[0];
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid - 1 >= 0 && nums[mid - 1] > nums[mid])
                return nums[mid];
            if (mid + 1 < nums.length && nums[mid] > nums[mid + 1])
                return nums[mid + 1];
            if (nums[0] < nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public int findMin0(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        if (nums[0] < nums[nums.length - 1])
            return nums[0];
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid - 1 > 0 && nums[mid] < nums[mid - 1] && nums[mid] < nums[mid + 1])
                return nums[mid];
            else if (left >= 1 && left + 1 < nums.length && nums[left] < nums[left - 1] && nums[left] < nums[left + 1])
                return nums[left];
            else if (right >= 1 && right + 1 < nums.length && nums[right] < nums[right - 1] && nums[right] < nums[right + 1])
                return nums[right];
            else if (nums[mid] < nums[nums.length - 1]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return nums[0] < nums[nums.length - 1] ? nums[0] : nums[nums.length - 1];
    }
}
