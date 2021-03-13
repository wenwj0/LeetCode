package array;

public class S021_NextPermutation {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,2};
        S021_NextPermutation s021_nextPermutation = new S021_NextPermutation();
        s021_nextPermutation.nextPermutation(nums);
    }
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0)
            return;
        int i = nums.length - 2, j;
        for (i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                break;

            }
        }
        if (i >= 0) {
            for (j = nums.length - 1; j > i; j--) {
                if (nums[j] > nums[i]) {
                    swap(nums, j, i);
                    break;
                }
            }
        }
        reverse(nums, i + 1, nums.length - 1);
    }

    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
