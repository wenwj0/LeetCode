package greedy;

import javax.swing.*;
import java.util.Arrays;

public class S045_JumpGameII {
    public static void main(String[] args) {
        S045_JumpGameII test = new S045_JumpGameII();
        System.out.println(test.jump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(test.jump(new int[]{1}));
        System.out.println(test.jump(new int[]{1, 0}));
        System.out.println(test.jump(new int[]{0, 1}));
        System.out.println(test.jump(new int[]{1, 0, 1}));
        System.out.println(test.jump(new int[]{2, 3, 0, 1, 4}));
    }

    public int jump(int[] nums) {   // 贪心算法
        int maxPosition = 0;
        int curEdge = 0;
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > curEdge) {
                curEdge = maxPosition;
                cnt++;
            }
            maxPosition = Math.max(nums[i] + i, maxPosition);
        }
        return cnt;
    }

    public int jump0(int[] nums) { //非贪心
        if (nums.length == 1) {
            return 0;
        }
        int[] cnt = new int[nums.length + 1];
        Arrays.fill(cnt, Integer.MAX_VALUE);
        cnt[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j <= nums[i] && i + j < nums.length; j++) {
                cnt[i + j] = Math.min(cnt[i] + 1, cnt[i + j]);
            }
        }
        return cnt[nums.length - 1] == Integer.MAX_VALUE ? 0 : cnt[nums.length - 1];
    }
}
