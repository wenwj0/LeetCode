package greedy;

public class S055_JumpGame {
    public static void main(String[] args) {
        S055_JumpGame s055_jumpGame = new S055_JumpGame();
        System.out.println(s055_jumpGame.canJump(new int[]{2,3,1,1,4}));
    }

    public boolean canJump(int[] nums) {
        if (nums==null || nums.length==0)
            return false;
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i>maxLen)
                return false;
            int curLen = i+ nums[i];
            if (curLen>=nums.length-1)
                return true;
            maxLen = Math.max(maxLen,curLen);
        }
        return false;
    }
}
