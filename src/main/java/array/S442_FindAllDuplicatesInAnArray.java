package array;

import java.util.LinkedList;
import java.util.List;

public class S442_FindAllDuplicatesInAnArray {
    public static void main(String[] args) {
        S442_FindAllDuplicatesInAnArray test = new S442_FindAllDuplicatesInAnArray();
        test.findDuplicates(new int[]{
                4, 3, 2, 7, 8, 2, 3, 1
        });
    }

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            int n = Math.abs(nums[i]);
            if (nums[n-1] <0)
                res.add(n);
            else
                nums[n - 1] *= -1;
        }
        return res;
    }
}
