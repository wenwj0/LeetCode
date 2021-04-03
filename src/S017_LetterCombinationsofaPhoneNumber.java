package src;

import java.util.LinkedList;
import java.util.List;

public class S017_LetterCombinationsofaPhoneNumber {
    public List<String> letterCombinations(String digits) {
        char[] nums = digits.toCharArray();
        char[] alphabet = {'a','b','c','d','e','f',
                'g','h','i','j','k','l',
                'm','n','o','p','q','r',
                's','t','u','v','w','x','y','z'};
        List<String> res = new LinkedList<>();
        for(int i=0;i<nums.length;i++){
                StringBuilder sb =new StringBuilder();
            for(int j=0;j<3;j++){
                
            }
            if(nums[i]==9){

            }else {

            }

        }
        return res;

    }
}
