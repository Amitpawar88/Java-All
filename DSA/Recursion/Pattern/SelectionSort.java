package Pattern;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min_index]) {
                    min_index = j;
                }
            }

            int temp = nums[min_index];
            nums[min_index] = nums[i];
            nums[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 1};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
