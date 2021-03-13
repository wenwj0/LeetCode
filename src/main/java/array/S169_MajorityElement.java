package array;

public class S169_MajorityElement {
    public int majorityElement(int[] nums){
        int cnt = 1;
        int temp = nums[0];
        for (int i=1;i<nums.length;i++){
            if (nums[i]==temp){
                cnt++;
                if (cnt>nums.length/2){
                    return temp;
                }
            }else {
                cnt--;
                if (cnt==0){
                    temp = nums[i];
                    cnt++;
                }
            }
        }
        return temp;
    }
}
