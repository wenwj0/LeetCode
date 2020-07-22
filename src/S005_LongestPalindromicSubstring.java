public class S005_LongestPalindromicSubstring {
    /**
     * 中心扩展法
     * @param s
     * @return
     */
    public String longestPalindrome0(String s) {
        if(s==null||s.length()==0) return s;
        char[] chars = s.toCharArray();
        int left = 0;
        int right = 0;
        int max = 1;
        for(int i=0;i<chars.length;i++){
            int index = i;
            int l = i,r = i+1;
            while(l>=0 && r<chars.length && chars[l]==chars[r]){
                if(r-l+1>max){
                    max = r-l+1;
                    left = l;
                    right = r;
                }
                l--;r++;
            }
            l = i-1;r = i+1;
            while(l>=0 && r<chars.length && chars[l]==chars[r]){
                if(r-l+1>max){
                    max = r-l+1;
                    left = l;
                    right = r;
                }
                l--;r++;
            }
        }
        return s.substring(left,right+1);
    }

    /**
     * 动态规划法
     * @param s
     * @return
     */
    public String longestPalindrome(String s){
        if(s==null || s.length()==0)
            return s;
        String res = "";
        char[] chars = s.toCharArray();
        int n = chars.length;
        int max = 0;
        boolean[][] dp = new boolean[n+1][n+1];
        for(int len=0;len<n;len++){
            for(int i=0;i+len<n;i++ ){
                int j=i+len;
                if(len==0){
                    dp[i][j] = true;
                }else if(len==1){
                    dp[i][j] = chars[i]==chars[j];
                }else{
                    dp[i][j] = dp[i+1][j-1] && chars[i]==chars[j];
                }
                if(dp[i][j] && len+1>max){
                    res = s.substring(i,j+1);
                    max = len+1;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(new S005_LongestPalindromicSubstring().longestPalindrome(s));
    }
}
