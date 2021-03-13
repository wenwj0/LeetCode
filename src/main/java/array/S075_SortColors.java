package array;

public class S075_SortColors {
    public static void main(String[] args) {
        S075_SortColors s075_sortColors = new S075_SortColors();
        s075_sortColors.sortColors(new int[]{2, 0, 2, 1, 1, 0});
    }

    public void sortColors(int[] nums) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < nums.length; i++) {
            switch (nums[i]) {
                case 0:
                    a++;
                    break;
                case 1:
                    b++;
                    break;
            }
        }
        for (int i = 0; i < a; i++) nums[i] = 0;
        for (int i = a; i < a+b; i++) nums[i] = 1;
        for (int i = a+b; i < nums.length; i++) nums[i] = 2;
    }
}
