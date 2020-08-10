import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class S018_FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new LinkedList<>();
        if (nums == null || nums.length < 4)
            return res;
        Arrays.sort(nums);
        for (int first = 0; first < nums.length; first++) {
            if(nums[first]+nums[nums.length-1]*3<target)
                continue;
            if(first+1<nums.length && nums[first]+nums[first+1]*3>target)
                break;
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            } else {
                for (int second = first + 1; second < nums.length; second++) {
                    if (second > first + 1 && nums[second - 1] == nums[second]) {
                        continue;
                    } else {
                        int left = second + 1;
                        int right = nums.length - 1;
                        int tempSum = target - nums[first] - nums[second];
                        while (left < right) {
                            if (nums[left] + nums[right] > tempSum) {
                                right--;
                            } else if (nums[left] + nums[right] < tempSum) {
                                left++;
                            } else {
                                res.add(Arrays.asList(nums[first], nums[second], nums[left], nums[right]));
                                left++;
                                right--;
                                while (left < right && nums[left] == nums[left - 1])
                                    left++;
                                while (left < right && nums[right] == nums[right + 1])
                                    right--;
                            }
                        }
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 0, -1, 0, -2, 2};
        List res = new S018_FourSum().fourSum(nums, 0);
        System.out.println();
    }
}
