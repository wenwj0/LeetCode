package array;

public class S034_FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = -1;
        int pos = -1;
        while (left <= right) {
            mid = (left + right+1) / 2;
            if (target == nums[mid]) {
                pos = mid;
                break;
            } else if (nums[mid] > target) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        if (pos == -1) {
            return new int[]{-1, -1};
        }
        left = pos;
        while (left - 1 >= 0 && nums[left - 1] == target)
            left--;
        right = pos;
        while (right + 1 < nums.length && nums[right + 1] == target)
            right++;
        return new int[]{left, right};
    }


    public int[] searchRange0(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int index = -1, l = -1, r = -1;
        int[] res = {l, r};
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                index = mid;
                break;
            } else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        int temp = index;
        if (index != -1)
            r = l = index;
        else
            return res;
        while (index + 1 < nums.length && nums[++index] == target)
            r = index;
        while (temp - 1 >= 0 && nums[--temp] == target)
            l = temp;
        res[0] = l;
        res[1] = r;
        return res;
    }
}
