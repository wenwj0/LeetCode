package java.byOrder;

import java.util.HashMap;
import java.util.Map;

public class S001_TwoSum {
    public int[] twoSum0(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] twoSum1(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                res[0] = map.get(nums[i]);
                res[1] = i;
                break;
            }
            int sub = target - nums[i];
            map.put(sub, i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] res = new S001_TwoSum().twoSum0(nums, target);
        for (int r : res)
            System.out.println(r);
    }
}
