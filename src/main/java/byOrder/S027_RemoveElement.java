package java.byOrder;

public class S027_RemoveElement {
    public int removeElement(int[] nums, int val) {
        if(nums==null || nums.length==0)
            return 0;
        int left = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                continue;
            }else {
                nums[left++] = nums[i];
            }
        }
        return left;
    }

    public static void main(String[] args) {
        S027_RemoveElement s027_removeElement = new S027_RemoveElement();
        System.out.println(s027_removeElement.removeElement(new int[]{0,1,2,2,3,0,4,2},2));
    }
}
