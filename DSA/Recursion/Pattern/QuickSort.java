package Pattern;

import java.util.Arrays;

public class QuickSort {
    static void sort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while (s <= e) {
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        sort(nums, low, e);
        sort(nums, s, high);
    }


    public static void main(String[] args) {
        int nums[] = {5, 4, 3, 2, 1};
        sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
