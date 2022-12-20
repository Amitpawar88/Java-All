package Pattern;

import java.util.Arrays;

public class QuickSort {
    static void sort(int [] nums, int low, int high) {
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

    public static void sortLast(int[] nums, int low, int high) {
        if (low < high) {
            
            int pi = partition(nums, low, high);

            sortLast(nums, low, pi - 1);
            sortLast(nums, pi + 1, high);
        }
    }

    public static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (nums[j] < pivot) {
                i++;

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        i++;
        int temp = nums[i];
        nums[i] = pivot;
        nums[high] = temp;

        return i;
    }


    public static void main(String[] args) {
        int nums[] = {5, 4, 3, 2, 1};
        sort(nums, 0, nums.length - 1);
        sortLast(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
