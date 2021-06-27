package HashTable;

import java.util.HashMap;
import java.util.Map;

public class S560_SubarraySumEqualsK {
    public static void main(String[] args) {
        S560_SubarraySumEqualsK test = new S560_SubarraySumEqualsK();
        System.out.println(test.subarraySum(new int[]{1, 2, 3}, 3));
        System.out.println(test.subarraySum(new int[]{1, 1, 1}, 2));
    }

    public int subarraySum(int[] nums, int k) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int pre = 0;
        map.put(pre, 1);
        for (int i = 0; i < nums.length; i++) {
            pre = pre + nums[i];
            int tmpSum = pre - k;
            if (map.containsKey(tmpSum)) {
                res += map.get(tmpSum);
            }
            if (map.containsKey(pre)) {
                map.put(pre, map.get(pre) + 1);
            } else {
                map.put(pre, 1);
            }
        }
        return res;
    }
}
