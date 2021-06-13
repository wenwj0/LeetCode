import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class S523_ContiuousSubarraySum {
    public static void main(String[] args) {
        S523_ContiuousSubarraySum test = new S523_ContiuousSubarraySum();
        System.out.println(test.checkSubarraySum(new int[]{23, 2, 4, 6, 7}, 6));
        System.out.println(test.checkSubarraySum(new int[]{23, 2, 6, 4, 7}, 6));
        System.out.println(test.checkSubarraySum(new int[]{23, 2, 6, 4, 7}, 13));
        System.out.println(test.checkSubarraySum(new int[]{0, 0, 0}, 13));
    }

    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int counter = 0;
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            counter += nums[i];
            counter %= k;
            if (map.containsKey(counter)) {
                int pre = map.get(counter);
                if (i - pre >= 2) {
                    return true;
                }
            }else {
                map.put(counter,i);
            }
        }
        return false;
    }
}