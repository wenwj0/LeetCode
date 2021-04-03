public class S004_MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2){
        int mid = 0;
        if(nums1==null){
            if(nums2.length%2==0){
                mid = (nums2.length-1)/2;
                return (double)(nums2[mid]+nums1[mid+1])/2;
            }else {
                return (double)nums2[nums2.length/2];
            }
        }
        if(nums2==null){
            if(nums1.length%2==0){
                mid = (nums1.length-1)/2;
                return (double)(nums1[mid]+nums1[mid+1])/2;
            }else {
                return (double)nums1[nums1.length/2];
            }
        }
        int num1 = nums1[0];
        int num2 = nums2[0];
        int p1 = 0;
        int p2 = 0;
        int cur=0;
        int len = nums1.length+nums2.length;
        mid = (len-1)/2;
        double res = 0;
        int num = nums1[0];
        while(p1<nums1.length && p2<nums2.length){
            if(nums1[p1]<=nums2[p2]){
                num=nums1[p1++];
            }else {
                num = nums2[p2++];
            }
            cur++;
            if(cur==mid){
                if(len%2==0){

                }else {
                    return (double)num;
                }
            }
        }
        return 2.;
    }
}
