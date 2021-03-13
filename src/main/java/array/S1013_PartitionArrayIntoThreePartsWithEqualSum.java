package array;

public class S1013_PartitionArrayIntoThreePartsWithEqualSum {
    public static void main(String[] args) {
        S1013_PartitionArrayIntoThreePartsWithEqualSum s1013_partitionArrayIntoThreePartsWithEqualSum = new S1013_PartitionArrayIntoThreePartsWithEqualSum();
        int[] nums = new int[]{1,-1,1,-1};
        boolean res = s1013_partitionArrayIntoThreePartsWithEqualSum.canThreePartsEqualSum(nums);
        System.out.println(res);
    }

    public boolean canThreePartsEqualSum(int[] arr) {
        if (arr == null || arr.length == 0 || arr.length == 1 || arr.length == 2)
            return false;
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        if (totalSum % 3 != 0)
            return false;
        int partSum = totalSum / 3;
        int cnt = 0;
        int tempSum = 0;
        for (int i = 0; i < arr.length; i++) {
            tempSum += arr[i];
            if (tempSum == partSum) {
                tempSum = 0;
                cnt++;
                if (cnt == 2&&i!=arr.length-1)
                    return true;
            }
        }
        return false;
    }
}
