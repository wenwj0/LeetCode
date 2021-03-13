package array;

public class S268_MissingNumber {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int total = (nums.length+1) * nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return total-sum;
    }
}
