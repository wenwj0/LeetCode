package array;

public class S209_MinimumSizeSubarraySum {
    public static void main(String[] args) {
        S209_MinimumSizeSubarraySum s209_minimumSizeSubarraySum = new S209_MinimumSizeSubarraySum();
        int[] nums = new int[]{
                7
        };
        System.out.println(s209_minimumSizeSubarraySum.minSubArrayLen(7, nums));
    }

    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int len = Integer.MAX_VALUE;
        boolean flag = false;
        while (left <= right) {
            if (sum < target && right < nums.length) {
                sum += nums[right++];
            } else if (left < nums.length) {
                sum -= nums[left++];
            } else {
                break;
            }
            if (sum >= target) {
                len = Math.min(len, (right - left));
                flag = true;
            }
        }
        return flag?len:0;
    }
}
