package array;

public class S004_FindMedianSortedArrays {
    public static void main(String[] args) {
        S004_FindMedianSortedArrays s004_findMedianSortedArrays = new S004_FindMedianSortedArrays();
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        double res = s004_findMedianSortedArrays.findMedianSortedArrays(nums1,nums2);
        System.out.println(res);
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int mid = (m + n) / 2;
        int left = 0;
        int right = 0;
        int cnt = 0;
        int[] nums = new int[nums1.length + nums2.length];
        while (left < m && right < n && cnt <= mid) {
            if (nums1[left] < nums2[right]) {
                nums[cnt++] = nums1[left++];
            } else {
                nums[cnt++] = nums2[right++];
            }
        }
        while (left < m && cnt <= mid) {
            nums[cnt++] = nums1[left++];
        }
        while (right < n && cnt <= mid) {
            nums[cnt++] = nums2[right++];
        }
        cnt-=1;
        if ((m + n) % 2 == 1) {
            return nums[cnt];
        }

        return (nums[cnt - 1] + nums[cnt]) / 2.;

    }
}
