package array;

import java.util.*;

public class S658_FindKClosestElements {
    public static void main(String[] args) {
        S658_FindKClosestElements test = new S658_FindKClosestElements();
        System.out.println(test.findClosestElements(new int[]{1, 2, 3, 9998, 9999}, 2, 9999));
        System.out.println(test.findClosestElements(new int[]{1, 3}, 1, 2));
        System.out.println(test.findClosestElements(new int[]{1, 3}, 1, 1));
        System.out.println(test.findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, -1));
        System.out.println(test.findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, 3));
        System.out.println(test.findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, 5));
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        Arrays.stream(arr).forEach(i -> list.add(i));

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int a = Math.abs(o1 - x);
                int b = Math.abs(o2 - x);
                if (a != b)
                    return a - b;
                return o1 - o2;
            }
        });
        List<Integer> result = list.subList(0,k);
        Collections.sort(result);
        return result;
    }

    public List<Integer> findClosestElements1(int[] arr, int k, int x) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > x) {
                right = mid - 1;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                left = mid;
                break;
            }
        }
        if (arr[left] > x) {
            left--;
        }
        right = left + 1;
        int cnt = 0;
        List<Integer> list = new ArrayList<>(k);
        while (cnt++ < k) {
            int leftNum = left >= 0 ? arr[left] : -10001;
            int rightNum = right < arr.length ? arr[right] : 10001;
            if (Math.abs(leftNum - x) < Math.abs(rightNum - x)) {
                list.add(leftNum);
                left--;
            } else if (Math.abs(leftNum - x) > Math.abs(rightNum - x)) {
                list.add(rightNum);
                right++;
            } else {
                list.add(leftNum);
                left--;
            }
        }
        Collections.sort(list);
        return list;
    }
}
