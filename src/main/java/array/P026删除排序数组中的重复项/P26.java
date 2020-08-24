package java.array.P026删除排序数组中的重复项;

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return 1;
        int cnt = 1;
        int temp = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=temp){
                nums[cnt] = nums[i];
                cnt++;
                temp = nums[i];
            } 
        }
        return cnt;
    }
}