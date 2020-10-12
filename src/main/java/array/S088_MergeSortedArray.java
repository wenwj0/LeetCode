package array;

import java.util.Arrays;

public class S088_MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		if(m==0) {
			for(int i=0;i<n;i++) {
				nums1[i]=nums2[i];
			}
			return;
		}
		int i=m-1,j=n-1;
		int k = m+n-1;
		while(i>=0&&j>=0) {
			if(nums1[i]>nums2[j]) {
				nums1[k--] = nums1[i--];
			}else {
				nums1[k--] = nums2[j--];
			}
		}
		while(j>=0) {
			nums1[k--] = nums2[j--];
		}
		while(i>=0) {
			nums1[k--] = nums1[i--];
		}
	}
	public void merge1(int[] nums1, int m, int[] nums2, int n) {
		int j = 0;
		for(int i=m;i<m+n;i++) {
			nums1[i] = nums2[j++];
		}
		Arrays.sort(nums1);
	}
}
