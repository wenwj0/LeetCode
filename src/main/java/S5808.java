public class S5808 {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n+n];
        for (int i=0;i<n;i++){
            ans[i] = nums[i];
        }
        for (int i=n;i<n+n;i++){
            ans[i] = nums[i-n];
        }
        return ans;
    }
}
