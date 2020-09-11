package array;

public class S026_RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0)
            return 0;
        if(nums.length==1)
            return 1;
        int left = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[left]){
                continue;
            }else {
                left++;
                nums[left] = nums[i];
            }
        }
        return left+1;
    }

    public static void main(String[] args) {
        int len= new S026_RemoveDuplicatesFromSortedArray().removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
        System.out.println(len);
    }
}
