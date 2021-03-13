package array;

public class S724_FindPivotIndex {
    public static void main(String[] args) {
        S724_FindPivotIndex s724_findPivotIndex = new S724_FindPivotIndex();
        int[] nums = new int[]{-1,3,0};
        int res = s724_findPivotIndex.pivotIndex(nums);
        System.out.println(res);
    }
    public int pivotIndex(int[] nums) {
        if (nums==null || nums.length==0)
            return -1;
        int left  = 0;
        int right = 0;
        for (int i=1;i<nums.length;i++){
            right+= nums[i];
        }
        for (int i=0;i<nums.length;i++){
            if (left==right){
                return i;
            }
            left += nums[i];
            if (i==nums.length-1) {
                right = 0;
            }else {
                right -= nums[i + 1];
            }
        }
        return -1;
    }
}
