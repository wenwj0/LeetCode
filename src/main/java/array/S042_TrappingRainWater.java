package array;

public class S042_TrappingRainWater {
    public static void main(String[] args) {
        S042_TrappingRainWater s042_trappingRainWater = new S042_TrappingRainWater();
        int[] nums = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(s042_trappingRainWater.trap(nums));
    }
    public int trap(int[] height) {
        if (height==null || height.length==0)
            return 0;
        int leftWall = height[0];
        int leftWallIndex = 0;
        int sum =  0;
        for (int i=0;i<height.length;i++){
            if (leftWall<=height[i]){
                for (int j=leftWallIndex;j<i;j++){
                    sum += leftWall-height[j];
                }
                leftWall = height[i];
                leftWallIndex =i;
            }
        }
        int rightWallIndex = height.length-1;
        int rightWall = height[rightWallIndex];
        for (int i=height.length-1;i>=leftWallIndex;i--){
            if (rightWall<=height[i]){
                for (int j=rightWallIndex;j>i;j--){
                    sum += rightWall-height[j];
                }
                rightWall = height[i];
                rightWallIndex = i;
            }
        }
        return sum;
    }
}
