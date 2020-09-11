package array;

import java.util.*;

public class S015_ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        Arrays.sort(nums);
        for (int first = 0; first < nums.length; first++) {
            if (first > 0 && nums[first] == nums[first - 1])
                continue;
            int third = nums.length - 1;
            for (int second = first + 1; second < third; second++) {
                if (first + 1 < second && nums[second] == nums[second - 1])
                    continue;
                while (second < third && nums[second] + nums[third] + nums[first] > 0)
                    third--;
                if (second == third)
                    break;
                if (nums[second] + nums[third] + nums[first] == 0) {
                    List<Integer> temp = new ArrayList<>(3);
                    temp.add(nums[first]);
                    temp.add(nums[second]);
                    temp.add(nums[third]);
                    res.add(temp);
                }
            }
        }
        return res;
    }

    public List<List<Integer>> threeSum0(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int lo = i + 1, hi = nums.length - 1;
            int sum = -nums[i];
            while (lo < hi) {
                if (nums[lo] + nums[hi] == sum) {
                    res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                    while (nums[lo] == nums[lo + 1])
                        lo++;
                    while (nums[hi] == nums[hi - 1])
                        hi--;
                } else {
                    lo++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 0};
//        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> res = new S015_ThreeSum().threeSum(nums);
        System.out.println();
    }
}
