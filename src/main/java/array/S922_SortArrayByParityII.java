package array;

public class S922_SortArrayByParityII {
    public static void main(String[] args) {
        S922_SortArrayByParityII s922_sortArrayByParityII = new S922_SortArrayByParityII();
        int[] nums = new int[]{4,2,5,7};
        for (int a:s922_sortArrayByParityII.sortArrayByParityII(nums)){
            System.out.println(a);
        }
    }
    public int[] sortArrayByParityII(int[] nums) {
        if (nums==null || nums.length==0)
            return nums;
        int odd = 1;
        int even = 0;
        int  len  = nums.length;
        while(odd<len && even<len){
            if ((nums[odd]&1)==0 && (nums[even]&1)==1){
                int temp = nums[odd];
                nums[odd] = nums[even];
                nums[even] = temp;
                odd += 2;
                even +=2;
            }
            for (;odd<len;odd+=2){
                if ((nums[odd]&1)==0){
                    break;
                }
            }
            for (;even<len;even+=2){
                if ((nums[even]&1)==1){
                    break;
                }
            }
        }
        return nums;
    }
    public int[] sortArrayByParityII0(int[] A) {
        int n = A.length;
        int j = 1;
        for (int i = 0; i < n; i += 2) {
            if (A[i] % 2 == 1) {
                while (A[j] % 2 == 1) {
                    j += 2;
                }
                swap(A, i, j);
            }
        }
        return A;
    }

    public void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
