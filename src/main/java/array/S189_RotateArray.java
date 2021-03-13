package array;

public class S189_RotateArray {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        swap(nums, 0, len - k - 1);
        swap(nums, len - k, len - 1);
        swap(nums, 0, len - 1);
    }

    public void swap(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
