package HashTable;

public class S525_ContiguousArray {
    public static void main(String[] args) {
        S525_ContiguousArray test = new S525_ContiguousArray();
        System.out.println(test.findMaxLength(new int[]{0, 1, 1}));
        System.out.println(test.findMaxLength(new int[]{0, 1}));
        System.out.println(test.findMaxLength(new int[]{0, 0, 1, 1}));
        System.out.println(test.findMaxLength(new int[]{0, 1, 0}));
        System.out.println(test.findMaxLength(new int[]{0, 1, 0, 1}));
    }

    public int findMaxLength(int[] nums) {
        int max = Integer.MIN_VALUE;
        if (nums.length <= 1)
            return 0;
        int cur = 0;
        int pre = 2;
        if (nums[1] != nums[0]) {
            pre = 1;
            cur = 1;
            max = 1;
        }
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                cur++;
            } else {
                if (cur == pre) {
                    max = Math.max(max, cur);
                }
                pre = cur;
                cur = 1;
            }
        }
        if (cur == pre)
            max = Math.max(max, pre);
        return max * 2;
    }
}
