package array;

import java.util.HashMap;
import java.util.Map;

public class S217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums){
        if (nums.length==0){
            return false;
        }
        Map<Integer,Boolean> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i]))
                return true;
            map.put(nums[i],true);
        }
        return false;
    }
}
