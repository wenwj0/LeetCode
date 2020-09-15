package array;

public class S905_SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        if(A==null || A.length==0 || A.length==1)
            return A;
        int left = 0;
        int right = A.length-1;
        while(left<right){
            while(left<right && (A[left]&1)==0)
                left++;
            while(left<right && (A[right]&1)==1)
                right--;
            if(left<right) {
                int tmp = A[left];
                A[left] = A[right];
                A[right] = tmp;
            }
            left++;
            right--;
        }
        return A;
    }
}
