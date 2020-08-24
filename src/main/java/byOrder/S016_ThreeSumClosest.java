package java.byOrder;

import java.util.Arrays;

public class S016_ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int best = 100000;
        int len = nums.length;
        Arrays.sort(nums);
        for (int first = 0; first < len; first++) {
            if (first > 0 && nums[first] == nums[first - 1])
                continue;
            int second = first + 1;
            int third = len - 1;
            while (second < third) {
                while (second > first + 1 && nums[second] == nums[second - 1])
                    second++;
                int sum = nums[first] + nums[second] + nums[third];
                if (sum == target)
                    return sum;
                else if (Math.abs(target - sum) < Math.abs(best - target)) {
                    best = sum;
                }
                if (sum > target) {
                    int t0 = third - 1;
                    while (second < t0 && nums[t0] == nums[third])
                        t0--;
                    third = t0;
                } else {
                    int s0 = second+1;
                    while(s0 < third && nums[s0]==nums[second])
                        s0++;
                    second = s0;
                }
            }
        }
        return best;
}

    public static void main(String[] args) {
//        int[] nums = new int[]{-1,2,1,-4};
        int[] nums = new int[]{1, 1, -1, -1, 3};
        System.out.println(new S016_ThreeSumClosest().threeSumClosest(nums, -1));
    }
}
