public class S136_SingleNumber {
    public int singleNumber(int[] nums){
        if(nums==null || nums.length==0)
            return 0;
        int res = nums[0];
        for(int i=1;i<nums.length;i++){
            res ^= nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new S136_SingleNumber().singleNumber(new int[]{4,1,2,1,2}));
    }
}
