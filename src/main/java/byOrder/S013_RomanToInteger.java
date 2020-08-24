package java.byOrder;

import java.util.HashMap;
import java.util.Map;

public class S013_RomanToInteger {
    private int getValue(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public int romanToInt(String s) {
        if(s==null || s.length()==0)
            return 0;
        char[] str = s.toCharArray();
        int sum = 0;
        int preNum = getValue(str[0]);
        for(int i=1;i<str.length;i++){
            int num = getValue(str[i]);
            if(preNum<num){
                sum -= preNum;
            }else{
                sum += preNum;
            }
            preNum = num;
        }
        sum += preNum;
        return sum;
    }
    public int romanToInt0(String s) {
        if (s == null || s.length() == 0)
            return 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);
        char[] str = s.toCharArray();
        int res = 0;
        int pre = 0;
        for (int i = 0; i < str.length; i++) {
            int value = map.get(str[i]);
            res += value;
            if(value>pre)
                res -= pre*2;
            pre = value;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new S013_RomanToInteger().romanToInt("MCMXCIV"));
    }
}
