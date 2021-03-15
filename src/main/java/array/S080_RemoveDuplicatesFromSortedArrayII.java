package array;

public class S080_RemoveDuplicatesFromSortedArrayII {
    public static void main(String[] args) {
        S080_RemoveDuplicatesFromSortedArrayII s080_removeDuplicatesFromSortedArrayII = new S080_RemoveDuplicatesFromSortedArrayII();
        System.out.println(s080_removeDuplicatesFromSortedArrayII.removeDuplicates(new int[]{
                1, 1, 1, 2, 2, 2, 3, 3, 3
        }));
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int ptr = 1;
        int pre = 0;
        int cur = 1;
        while (cur < nums.length) {
            if (nums[cur] == nums[pre]) {
                while (cur + 1 < nums.length && nums[cur] == nums[cur + 1]) {
                    cur++;
                }
            }
            nums[ptr++] = nums[cur];
            pre = cur;
            cur++;
        }
        return ptr;
    }
}
