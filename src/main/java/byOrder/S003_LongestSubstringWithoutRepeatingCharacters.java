package java.byOrder;

import java.util.HashSet;
import java.util.Set;

public class S003_LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s){
        if(s==null || "".equals(s))
            return 0;
        int left = 0;
        int max = 0;
        int[] flag = new int[256];
        char[] str = s.toCharArray();
        for(int i=0;i<str.length;i++){
            if(flag[str[i]]==1){
                while(left<i){
                    if(str[left]==str[i]){
                        left++;
                        break;
                    }else {
                        flag[str[left]]=0;
                    }
                    left++;
                }
            }else {
                flag[str[i]]=1;
                max = Math.max(i-left+1,max);
            }
        }
        return max;
    }

    //Leecode answer
    class Solution {
        public int lengthOfLongestSubstring0(String s) {
            // 哈希集合，记录每个字符是否出现过
            Set<Character> occ = new HashSet<Character>();
            int n = s.length();
            // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
            int rk = -1, ans = 0;
            for (int i = 0; i < n; ++i) {
                if (i != 0) {
                    // 左指针向右移动一格，移除一个字符
                    occ.remove(s.charAt(i - 1));
                }
                while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                    // 不断地移动右指针
                    occ.add(s.charAt(rk + 1));
                    ++rk;
                }
                // 第 i 到 rk 个字符是一个极长的无重复字符子串
                ans = Math.max(ans, rk - i + 1);
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        String s = new String("tmmzuxt");
        System.out.println(new S003_LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(s));
    }
}
