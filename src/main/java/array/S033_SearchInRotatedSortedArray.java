package array;

public class S033_SearchInRotatedSortedArray {
    public static void main(String[] args) {
        S033_SearchInRotatedSortedArray s033_searchInRotatedSortedArray = new S033_SearchInRotatedSortedArray();
        System.out.println(s033_searchInRotatedSortedArray.search(new int[]{
                0,1,3
        }, 0));
    }

    public int search(int[] nums, int target) {
        if (nums.length == 0)
            return -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
