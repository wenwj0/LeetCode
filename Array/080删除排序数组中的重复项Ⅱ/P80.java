package leetcodeTest;

public class P80 {
	public int removeDuplicates(int[] nums) {
		if(nums == null || nums.length == 0 ){
            return 0; 
        }
        if(nums.length ==1 ){
            return 1; 
        }
        int k =0; 
        for(int i=0; i<nums.length; i++){
            
            if(k<2 || nums[i]!=nums[k-2] ){
                nums[k++] = nums[i]; 
            }
        }
        return k ;
    }
}
