package array;

public class S485_MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int[] dp = new int[nums.length];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                dp[i] = nums[i];
            } else {
                dp[i] = nums[i] == 0 ? nums[i] : dp[i - 1] + 1;
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
